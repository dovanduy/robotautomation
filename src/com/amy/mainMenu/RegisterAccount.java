package com.amy.mainMenu;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class RegisterAccount extends UiAutomatorTestCase{
	public void testDemo() throws UiObjectNotFoundException { 
//		UiObject registerAmyAccount = new UiObject(new UiSelector().text("注册艾米账号"));
//	    UiObject id = new UiObject(new UiSelector().text("ID"));
//	    UiObject id = new UiObject(new UiSelector().text("当前昵称"));
//	    UiObject password = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/et_password"));
//	    UiObject passwordConfirm = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/et_confirmpassword"));
//	    UiObject passwordConfirm = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_secretquestion1"));
	   
	    UiObject loginButton = new UiObject(new UiSelector().text("登 录"));
	    
//	    if(registerAmyAccount.exists() && registerAmyAccount.isEnabled())
//	      {
//	    	registerAmyAccount.click();
//	      }
//	      try {
//	          Thread.sleep(1000); 
//	      } catch (InterruptedException e1) {  
//	          // TODO Auto-generated catch block  
//	          e1.printStackTrace();  
//	      }
	}
}
