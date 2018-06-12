package com.amy.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.android.uiautomator.core.UiObjectNotFoundException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 得到今天天气
 * @author 徐传志
 *
 */
public class Weather { 
	String Cityid; 
    String key;
    URLConnection connectionData; 
    StringBuilder sb; 
    BufferedReader br;// 读取data数据流 
    JSONObject jsonData; 
    JSONObject jsonData1;
    JSONObject jsonDataBasic;
    JSONObject jsonDataNow;
    JSONObject jsonDataCond;
    JSONObject info;     
      
    public Map getWeather() throws IOException ,NullPointerException{
    	
  
        // 连接和风天气
        URL url = new URL("https://free-api.heweather.com/v5/now?city=hangzhou&key=c237febb530c4e07a5d141437fc41d0c"); 
        connectionData = url.openConnection(); 
        connectionData.setConnectTimeout(1000); 
        try { 
            br = new BufferedReader(new InputStreamReader( 
                    connectionData.getInputStream(), "UTF-8")); 
            sb = new StringBuilder(); 
            String line = null; 
            while ((line = br.readLine()) != null) 
                sb.append(line); 
        } catch (SocketTimeoutException e) { 
            System.out.println("连接超时"); 
        } catch (FileNotFoundException e) { 
            System.out.println("加载文件出错"); 
        } 
          String datas = sb.toString();   
          jsonData = JSONObject.fromObject(datas);  
          JSONArray json_arr= jsonData.getJSONArray("HeWeather5"); 
          jsonData1 = (JSONObject) json_arr.get(0);
          jsonDataBasic = jsonData1.getJSONObject("basic");
          jsonDataNow = jsonData1.getJSONObject("now");
          jsonDataCond = jsonDataNow.getJSONObject("cond");
          Map<String,Object> map = new HashMap<String, Object>();
          map.put("city", jsonDataBasic.getString("city").toString());
          map.put("weather", jsonDataCond.getString("txt").toString());
          map.put("tmp", jsonDataNow.getString("tmp").toString());

          
          return map;
 
    } 
    

public static void main(String[] args) {
	try{
	Weather weather = new Weather();
	Map<String,Object> map = new HashMap<String, Object>();
	map = weather.getWeather();
	System.out.println(map.get("weather"));
	}catch(IOException e){
		e.printStackTrace();
	}
	
}
}