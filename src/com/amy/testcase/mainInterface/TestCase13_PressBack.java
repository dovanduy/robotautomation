package com.amy.testcase.mainInterface;

import com.amy.util.BasicTestCase;
import com.android.uiautomator.core.UiDevice;

public class TestCase13_PressBack extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase13(){
		//登录后在主界面
		Boolean expectMainMenu = true;
		Boolean actualMainMenu = pm.getPageMainMenu().getMainMenuTitleTextExist();
		assertEquals(expectMainMenu,actualMainMenu);
		//跳转到朋友页面
		pm.getPageMainMenu().GoToFriendsPage();
		Boolean expectFriends = true;
		Boolean actualFriends = pm.getPageFriends().getSearchTextExist();
		assertEquals(expectFriends,actualFriends);
		//返回主界面
		UiDevice.getInstance().pressBack();
		//验证是否在主界面
		Boolean expectMainMenudouble = true;
		Boolean actualMainMenudouble = pm.getPageMainMenu().getMainMenuTitleTextExist();
		assertEquals(expectMainMenudouble,actualMainMenudouble);
		
	}

}
