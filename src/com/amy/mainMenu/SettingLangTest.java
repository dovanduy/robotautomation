package com.amy.mainMenu;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
//import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class SettingLangTest extends UiAutomatorTestCase {   
   public void testDemo() throws UiObjectNotFoundException {   

	  //寻找设置按钮
      UiObject setButton = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/iv_settings"));
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
      
      //切换到英文
      UiObject langprcButton = new UiObject(new UiSelector().text("语言"));
      if(langprcButton.exists() && langprcButton.isEnabled())
      {
    	  langprcButton.click();
      }
      
      UiObject langENGButton = new UiObject(new UiSelector().text("English"));
      if(langENGButton.exists() && langENGButton.isEnabled())
      {
    	  langENGButton.click();
      }

      //切换到中文香港
      try {  
          Thread.sleep(1000);  
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      UiObject langengButton = new UiObject(new UiSelector().text("Language"));
      if(langengButton.exists() && langengButton.isEnabled())
      {
    	  langengButton.click();
      }
      
      UiObject langHKButton = new UiObject(new UiSelector().text("中文 (香港)"));
      if(langHKButton.exists() && langHKButton.isEnabled())
      {
    	  langHKButton.click();
      }
      
      //切换到中文繁体
      try {  
          Thread.sleep(1000);  
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      UiObject langhkButton = new UiObject(new UiSelector().text("语言"));
      if(langhkButton.exists() && langhkButton.isEnabled())
      {
    	  langhkButton.click();
      }
      
      UiObject langTWNButton = new UiObject(new UiSelector().text("中文 (繁體)"));
      if(langTWNButton.exists() && langTWNButton.isEnabled())
      {
    	  langTWNButton.click();
      }
      
      //切换到中文简体
      try {  
          Thread.sleep(1000);  
      } catch (InterruptedException e1) {  
          // TODO Auto-generated catch block  
          e1.printStackTrace();  
      }
      UiObject langtwnButton = new UiObject(new UiSelector().text("语言"));
      if(langtwnButton.exists() && langtwnButton.isEnabled())
      {
    	  langtwnButton.click();
      }
      
      UiObject langPRCButton = new UiObject(new UiSelector().text("中文 (简体)"));
      if(langPRCButton.exists() && langPRCButton.isEnabled())
      {
    	  langPRCButton.click();
      }
    
   }
}

