package com.amy.ReusableFunction;

import com.amy.BasePages.*;
import com.amy.util.BasicTestCase;
import com.amy.util.PagesManager;

public class LoginActivity extends BasicTestCase{
	public void signInDefaultUser() throws Exception {
		pm = new PagesManager();
		//登录后需跳转到新闻页面
		pm.getPageLogin().login("test5", "123456");
		Thread.sleep(5000);
		Boolean expect = true;
		Boolean actual = pm.getPageMainMenu().getMainMenuTitleTextExist();
		assertEquals(expect,actual);
		
	}

}
