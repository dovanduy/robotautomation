package com.amy.ReusableFunction;

import com.amy.util.BasicTestCase;
import com.amy.util.PagesManager;

public class LogoutActivity extends BasicTestCase{
	public void Logout() throws Exception {
		pm = new PagesManager();
		pm.getPageMainMenu().GoToSettingPage();
		pm.getPageSetting().goToLogoutPage();
		pm.getPageLogout().logout();
		Boolean expect = true;
		Boolean actual = pm.getPageLogin().getLoginButtonExist();
		assertEquals(expect,actual);
	}

}
