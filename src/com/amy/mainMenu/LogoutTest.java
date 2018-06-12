package com.amy.mainMenu;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class LogoutTest extends UiAutomatorTestCase {   
   public void testDemo() throws UiObjectNotFoundException {   
	   
	   UiObject setButton = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/iv_settings"));
	   UiObject manageAccountButton = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_manageaccount"));
	   UiObject confirmButton = new UiObject(new UiSelector().text("确 定"));
	   
	   //进入这只界面
	  if(setButton.exists() && setButton.isEnabled())
	  {
		  setButton.click();
	  }
	  try {  
	      Thread.sleep(1000);  
	  } catch (InterruptedException e1) {  
	      // TODO Auto-generated catch block  
	      e1.printStackTrace();  
	  }
	  
	  if(manageAccountButton.exists() && manageAccountButton.isEnabled())
	  {
		  manageAccountButton.click();
	  }
	  try {  
	      Thread.sleep(1000);  
	  } catch (InterruptedException e1) {  
	      // TODO Auto-generated catch block  
	      e1.printStackTrace();  
	  }
	  if(confirmButton.exists() && confirmButton.isEnabled())
	  {
		  confirmButton.click();
	  }
   }
}




