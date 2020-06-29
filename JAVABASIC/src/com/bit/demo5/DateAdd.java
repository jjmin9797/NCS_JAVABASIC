package com.bit.demo5;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;


public class DateAdd {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
		Date d1 = f.parse("01:05:10");
		Date d2 = f.parse("01:05:07");
		long diff = d1.getTime() - d2.getTime();
		long sec = diff / 1000;
		System.out.println(sec);
	}
} 