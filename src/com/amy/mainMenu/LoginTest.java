package com.amy.mainMenu;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class LoginTest extends UiAutomatorTestCase {   
   public void testDemo() throws UiObjectNotFoundException {   

      UiObject idText = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/et_username"));
      UiObject passText = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/et_password"));
      UiObject loginButton = new UiObject(new UiSelector().text("登 录"));

      if(idText.exists() && idText.isEnabled())
      {
    	  idText.click();
      }
      try {
          Thread.sleep(1000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      
      //输入账号
      UiDevice.getInstance().click(177,624);//点击z
      UiDevice.getInstance().click(984,456);//点击o
      UiDevice.getInstance().click(756,456);//点击u
      UiDevice.getInstance().click(236,540);//点击s
      UiDevice.getInstance().click(695,540);//点击h
      UiDevice.getInstance().click(294,456);//点击e
      UiDevice.getInstance().click(756,624);//点击n
      UiDevice.getInstance().click(578,540);//点击g
      UiDevice.getInstance().click(1187,540);//点击回车
      
      try {
          Thread.sleep(1000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      
      if(passText.exists() && passText.isEnabled())
      {
    	  passText.click();
      }
      try {
          Thread.sleep(1000); 
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      } 
      
      //输入密码
      UiDevice.getInstance().click(1212,380);//点击0
      UiDevice.getInstance().click(1212,380);//点击0
      UiDevice.getInstance().click(1212,380);//点击0
      UiDevice.getInstance().click(1212,380);//点击0
      UiDevice.getInstance().click(1212,380);//点击0
      UiDevice.getInstance().click(1212,380);//点击0
      UiDevice.getInstance().click(1187,540);//点击回车
      
      if(loginButton.exists() && loginButton.isEnabled())
      {
    	  loginButton.click();
      }

   }
}



