package com.amy.testcase.mainInterface;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.amy.util.BasicTestCase;
import com.amy.util.Weather;
import com.android.uiautomator.core.UiObjectNotFoundException;

public class TestCase8_LocationAndWeather extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase8() throws IOException ,NullPointerException{
		try{
		//登录后需跳转到应用列表页面
		pm.getPageMainMenu().GoToWeatherPage();
		Weather weather = new Weather();
        Map<String,Object> weatherFromNet = new HashMap<String, Object>();
        weatherFromNet = weather.getWeather();

		String city = pm.getPageWeather().getCityText().getText().toString();
		String temp = pm.getPageWeather().getTempText().getText().toString();
		String wea = pm.getPageWeather().getWeatherText().getText().toString();
		assertEquals(city,weatherFromNet.get("city"));
		assertEquals(temp,weatherFromNet.get("temp"));
		assertEquals(wea,weatherFromNet.get("weather"));
		}catch(UiObjectNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
	

}
