package lianxi4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	int year, month, day;

	public MyDate() {
      Date date = new Date();
      year = date.getYear()+1900;
      month = date.getMonth()+1;
      day = date.getDate();
	}

	public MyDate(int year,int month,int days) {
		String str = year+"-"+month+"-"+days;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sf.parse(str);
			this.year = date.getYear()+1900;
			this.month = date.getMonth()+1;
			day = date.getDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    //System.out.println(date.getYear()+1900+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日"+date);
	}

	public MyDate(Long time) {
		Date date = new Date(time);
		year = date.getYear()+1900;
		month = date.getMonth()+1;
		day = date.getDate();
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public static void main(String[] args) {

		MyDate md1= new MyDate(1970,9,23);
		System.out.println(md1.toString());
		MyDate md2 = new MyDate(561555550000L);
		System.out.println(md2.toString());
		MyDate md3 = new MyDate();
		System.out.println(md3.toString());
	}

}
