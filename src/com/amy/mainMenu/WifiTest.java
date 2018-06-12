package com.amy.mainMenu;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class WifiTest extends UiAutomatorTestCase {   
   public void testDemo() throws UiObjectNotFoundException {   

	  //进入WLAN设置界面
      UiObject wifiButton = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/iv_wifi"));
      UiObject swicthButton = new UiObject(new UiSelector().resourceId("com.android.settings:id/switch_widget"));
      UiObject wifiDisableStatus = new UiObject(new UiSelector().text("关闭"));
      UiObject wifiEnableStatus = new UiObject(new UiSelector().text("开启"));
      UiObject ssidButton = new UiObject(new UiSelector().text("TestLAB"));
      UiObject passText = new UiObject(new UiSelector().resourceId("com.android.settings:id/password"));
      UiObject connButton = new UiObject(new UiSelector().text("连接"));
      UiObject connPassStatus = new UiObject(new UiSelector().text("已连接"));
      UiObject disconnButton = new UiObject(new UiSelector().text("取消保存"));
      
      if(wifiButton.exists() && wifiButton.isEnabled())
      {
    	  wifiButton.click();
      }
      try {
          Thread.sleep(1000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      if(connPassStatus.exists())
      {
    	  ssidButton.click();//返回
      }
      try {
          Thread.sleep(1000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      if(disconnButton.exists())
      {
    	  disconnButton.click();//返回
      }
      try {
          Thread.sleep(1000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      //关闭WIFI
      if(wifiEnableStatus.exists())
      {
    	  swicthButton.click();
      }
      try {  
          Thread.sleep(1000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
    //打开WIFI
      if(wifiDisableStatus.exists())
      {
    	  swicthButton.click();
      }

	  //延迟3秒，等待SSID列表的刷新
      try {  
          Thread.sleep(8000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      if(ssidButton.exists())
      {
    	  ssidButton.click();
    	  
          if(passText.exists())
          {
        	  passText.click();
        	  
              //输入密码
              UiDevice.getInstance().click(118,538);//点击a
              UiDevice.getInstance().click(869,624);//点击m
              UiDevice.getInstance().click(640,455);//点击y
              UiDevice.getInstance().click(319,382);//点击3
              UiDevice.getInstance().click(197,382);//点击2
              UiDevice.getInstance().click(702,382);//点击6
              UiDevice.getInstance().click(319,382);//点击3
              UiDevice.getInstance().click(197,382);//点击2
              UiDevice.getInstance().click(1082,382);//点击9
              
              if(connButton.exists() && connButton.isEnabled())
              {
            	  UiDevice.getInstance().click(934,290);//点击链接
              }
              
              try {  
                  Thread.sleep(3000); 
              } catch (InterruptedException e1) {  
                  // TODO Auto-generated catch block  
                  e1.printStackTrace();  
              }
              if(connPassStatus.exists())
              {
            	  getUiDevice().pressBack();//返回
              }
          }
      }
   }
}


