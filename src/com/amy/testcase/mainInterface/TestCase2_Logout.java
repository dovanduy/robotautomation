package com.amy.testcase.mainInterface;

import com.amy.ReusableFunction.LoginActivity;
import com.amy.util.BasicTestCase;

public class TestCase2_Logout extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase2() throws Exception{
		pm.getPageMainMenu().GoToSettingPage();
		pm.getPageSetting().goToLogoutPage();
		pm.getPageLogout().logout();
		sleep(5000);
		Boolean expect = true;
		Boolean actual = pm.getPageLogin().getLoginButtonExist();
		assertEquals(expect,actual);
		
		sleep(5000);
		LoginActivity login = new LoginActivity();
		login.signInDefaultUser();
		sleep(3000);
		
	}

}
