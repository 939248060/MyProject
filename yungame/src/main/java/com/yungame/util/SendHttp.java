package com.yungame.util;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import com.yungame.messbean.Auto;
import com.yungame.messbean.JsonRootBean;
import com.yungame.messbean.PicInfo;
import com.yungame.messbean.Tech;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class SendHttp {

	public static String doGet(String url, String param) {

		String result = "";
		BufferedReader reader = null;
		String urlresult = url + param;
		try {
			URL u = new URL(urlresult);
			URLConnection urlConnection = u.openConnection();
			// 设置通用的请求属性
			urlConnection.setRequestProperty("accept", "*/*");
			urlConnection.setRequestProperty("connection", "Keep-Alive");
			urlConnection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			urlConnection.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = urlConnection.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
	}

	public static String sendPost(String url1, String JonsonObject) throws UnsupportedEncodingException, IOException {
		System.out.println(url1);
		URL url = new URL(url1);
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setDoOutput(true);
		http.setDoInput(true);
		http.setRequestMethod("POST");
		http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		http.connect();
		OutputStream os = http.getOutputStream();
		os.write(JonsonObject.getBytes("UTF-8"));
		InputStream inputStream = http.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String data = bufferedReader.readLine();
		while (data != null) {
			System.out.println(data);
			data += bufferedReader.readLine();
		}
		os.close();
		return data;
	}

	public static void main(String[] agr) {
		String date = doGet("https://www.apiopen.top/journalismApi"," ");
	   JSONObject job = JSONObject.fromObject(date);
	   Map classMap = new HashMap<String,Object>();
       classMap.put("tech", Tech.class);
	   classMap.put("auto",Auto.class);
	   classMap.put("picInfo",PicInfo.class);
	   JsonRootBean jrb = (JsonRootBean) JSONObject.toBean(job, JsonRootBean.class, classMap);
	   System.out.println(jrb.getData().getAuto().get(0).getTitle());
	   for (Auto auto : jrb.getData().getAuto()) {
//		   String ss = doGet(auto.getLink()," ");
	   System.out.println(auto.getCategory()+"标题："+auto.getTitle());
	   	            
	System.out.println(auto.getPicInfo().get(0).getUrl());
	
	   
	 }
	   Map<String , List<Tech>> techMap = new HashMap<String , List<Tech>>();
	   
		for (Tech tech : jrb.getData().getTech()) {
			if (!techMap.containsKey(tech.getCategory())) {
				List<Tech> tchList= new ArrayList<Tech>();
				tchList.add(tech);
				techMap.put(tech.getCategory(), tchList);
			}else {
				List<Tech> tchList = techMap.get(tech.getCategory());
				tchList.add(tech);
				techMap.put(tech.getCategory(),tchList);
			}
			System.out.println(tech.getCategory()+"标题："+tech.getTitle());
			//System.out.println(tech.getImgsrcFrom());
		}
	}
	
	public <T>  Map<String , List<Tech>> swith(T news,JsonRootBean jrb ) {
		  Map<String , List<Tech>> techMap = new HashMap<String , List<Tech>>();
		   
			for (Tech tech : jrb.getData().getTech()) {
				if (!techMap.containsKey(tech.getCategory())) {
					List<Tech> tchList= new ArrayList<Tech>();
					tchList.add(tech);
					techMap.put(tech.getCategory(), tchList);
				}else {
					List<Tech> tchList = techMap.get(tech.getCategory());
					tchList.add(tech);
					techMap.put(tech.getCategory(),tchList);
				}
				System.out.println(tech.getCategory()+"标题："+tech.getTitle());
				//System.out.println(tech.getImgsrcFrom());
			}
			return techMap;
	}
}
