package com.yungame.test;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李超强 on 2017/9/14.
 */
public class TestJson {
    public static void main(String[] args) {
        String str = "b,7, , , ,4";
        String arr[] = str.split(",");
        int i = 1;
        JSONObject job = new JSONObject();
        for (String c : arr) {
            job.put("attr"+i, c);
            System.out.print("attr"+i+":"+c+",");
            i++;
        }
       System.out.println(job.toString());

    }
}
