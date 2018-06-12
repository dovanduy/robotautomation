package com.amy.testcase.mainInterface;

import com.amy.util.BasicTestCase;
import com.android.uiautomator.core.UiDevice;

public class TestCase7_GoToSettingPage extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase7(){
		//登录后需跳转到设置页面
		pm.getPageMainMenu().GoToSettingPage();
		
		Boolean expect = true;
		Boolean actual = pm.getPageSetting().getSettingTextExist();
		assertEquals(expect,actual);
		UiDevice.getInstance().pressBack();
		
	}

}
