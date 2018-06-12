package com.amy.testcase.mainInterface;

import java.util.Map;

import com.amy.util.BasicTestCase;
import com.amy.util.DateAndTime;
import com.android.uiautomator.core.UiObjectNotFoundException;

public class TestCase9_DateAndTime extends BasicTestCase{
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase9(){
		try{
		//登录后在主界面
		String date_amy = pm.getPageMainMenu().getDateText().getText().toString();
		String time_amy = pm.getPageMainMenu().getTimeText().getText().toString();
		String week_amy = pm.getPageMainMenu().getWeekText().getText().toString();

		DateAndTime dateAndTime = new DateAndTime();
		Map<String,Object> map = dateAndTime.getDateAndTime();
		String date = map.get("Date").toString();
		String time = map.get("Time").toString();
		String week = map.get("Week").toString();

		assertEquals(date,date_amy);
		//assertEquals(time,time_amy);
		assertEquals(week,week_amy);
		}catch(UiObjectNotFoundException e){
			e.printStackTrace();
		}
		
	}

}
