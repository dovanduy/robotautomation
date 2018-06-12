package com.amy.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateAndTime {
	
	public Map getDateAndTime(){
		Map<String,Object> map = new HashMap<String, Object>();
		
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE yyyy-MM-dd HH:mm:ss");//可以方便地修改日期格式
		String dateAndTime = dateFormat.format( now );
		String date = dateAndTime.substring(4,14);
		String time = dateAndTime.substring(15,20);
		String week = dateAndTime.substring(0,3);
		map.put("Date", date);
		map.put("Time", time);
		map.put("Week", week);
		return map;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateAndTime d = new DateAndTime();
		Map<String,Object> maps = d.getDateAndTime();
		System.out.println(maps.get("Date"));
		System.out.println(maps.get("Time"));
		System.out.println(maps.get("Week"));
		//getWeekOfDate("2017-6-26");
	}

}
