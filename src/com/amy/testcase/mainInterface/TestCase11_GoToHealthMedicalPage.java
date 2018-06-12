package com.amy.testcase.mainInterface;

import com.amy.util.BasicTestCase;

public class TestCase11_GoToHealthMedicalPage extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase11(){
		//登录后需跳转到朋友页面
		pm.getPageMainMenu().GoToHealthMedicalPage();
		
		Boolean expect = true;
		Boolean actual = pm.getPageHealthMedical().getConfirmButtonExist();
		assertEquals(expect,actual);
		getUiDevice().pressBack();
		
	}

}
