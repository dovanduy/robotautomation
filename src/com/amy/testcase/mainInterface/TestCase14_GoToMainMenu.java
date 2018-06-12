package com.amy.testcase.mainInterface;

import com.amy.util.BasicTestCase;
import com.android.uiautomator.core.UiDevice;

public class TestCase14_GoToMainMenu extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	

	public void testTestCase14(){
		//登录后在主界面
		Boolean expectMainMenu = true;
		Boolean actualMainMenu = pm.getPageMainMenu().getMainMenuTitleTextExist();
		assertEquals(expectMainMenu,actualMainMenu);
		//跳转到朋友页面
		pm.getPageMainMenu().GoToFriendsPage();
		Boolean expectFriends = true;
		Boolean actualFriends = pm.getPageFriends().getSearchTextExist();
		assertEquals(expectFriends,actualFriends);
		//按主界面按键
		UiDevice.getInstance().pressHome();
		//验证是否在主界面
		Boolean expectMainMenudouble = true;
		Boolean actualMainMenudouble = pm.getPageMainMenu().getMainMenuTitleTextExist();
		assertEquals(expectMainMenudouble,actualMainMenudouble);
		
	}

}
