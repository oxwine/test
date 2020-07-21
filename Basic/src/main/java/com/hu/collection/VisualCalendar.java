package com.hu.collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VisualCalendar {
	public static void main(String[] args) {
		String temp = "2020-1-14";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = format.parse(temp);
			Calendar cal = new GregorianCalendar();
			cal.setTime(date);
			int day = cal.get(Calendar.DATE);
			
			cal.set(Calendar.DATE,1);
			
			System.out.println(cal.get(Calendar.DAY_OF_WEEK));
			System.out.println(cal.getActualMaximum(cal.DATE));
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			int j=0;
			for(int i=0;i<cal.getActualMaximum(cal.DATE)+(cal.get(Calendar.DAY_OF_WEEK)-1);i++) {
				if(i<cal.get(Calendar.DAY_OF_WEEK)-1) {
					System.out.print((char)0+"\t");
				} else {
					if(day==(i-(cal.get(Calendar.DAY_OF_WEEK)-2)))
						System.out.print("*");
				System.out.print((i-(cal.get(Calendar.DAY_OF_WEEK)-2))+"\t");
				}
				
				j++;
				if(j%7==0) {
					System.out.print('\n');
				}
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
