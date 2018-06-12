package com.amy.testcase.mainInterface;

import com.amy.util.BasicTestCase;

public class TestCase12_GoToAppsList extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase11(){
		//登录后需跳转到应用列表页面
		pm.getPageMainMenu().GoToAppsListPage();
		
		Boolean expect = true;
		Boolean actual = pm.getPageAppsList().getPaginalNumberExist();
		assertEquals(expect,actual);
		getUiDevice().pressBack();
		
		
	}

}
