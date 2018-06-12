package com.amy.testcase.mainInterface;

import com.amy.util.BasicTestCase;

public class TestCase1_Login extends BasicTestCase{
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase1() throws Exception{
		//登录后需跳转到新闻页面
		pm.getPageLogin().login("test6", "123456");
		Thread.sleep(5000);
		Boolean expect = true;
		Boolean actual = pm.getPageMainMenu().getMainMenuTitleTextExist();
		assertEquals(expect,actual);
		
	}

}
