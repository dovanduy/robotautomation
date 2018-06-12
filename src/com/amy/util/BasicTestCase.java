package com.amy.util;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class BasicTestCase extends UiAutomatorTestCase{
	protected PagesManager pm = null;

	

	protected void setUp(boolean isNeedLogin) throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		pm = new PagesManager();
        Thread.sleep(1000);
		if(isNeedLogin){
			pm.getPageLogin().login("test6", "123456");
		}
	}
	
	
	

}
