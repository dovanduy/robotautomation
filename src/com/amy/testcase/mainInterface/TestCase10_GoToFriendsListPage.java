package com.amy.testcase.mainInterface;

import com.amy.util.BasicTestCase;

public class TestCase10_GoToFriendsListPage extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase10(){
		//登录后需跳转到朋友页面
		pm.getPageMainMenu().GoToFriendsPage();
		
		Boolean expect = true;
		Boolean actual = pm.getPageFriends().getSearchTextExist();
		assertEquals(expect,actual);
		getUiDevice().pressBack();
		
	}

}
