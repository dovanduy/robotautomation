package com.amy.testcase.mainInterface;

import java.io.IOException;

import com.amy.util.BasicTestCase;
import com.android.uiautomator.core.UiDevice;

import android.os.RemoteException;

public class TestCase15_GoToMultiTaskManagement extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase15() throws InterruptedException{
		try{
		//登录后在主界面
		Boolean expectMainMenu = true;
		Boolean actualMainMenu = pm.getPageMainMenu().getMainMenuTitleTextExist();
		assertEquals(expectMainMenu,actualMainMenu);
		//打开多任务管理列表
		UiDevice.getInstance().pressRecentApps();
		Thread.sleep(3000);
		
		Boolean expectMultiTask = true;
		Boolean actualMultiTask = pm.getPageMultitaskManagement().getBackgroundAppthumbnailExist();
		assertEquals(expectMultiTask,actualMultiTask);
		UiDevice.getInstance().pressBack();

		
		}catch(RemoteException e){
			e.printStackTrace();
			
		}
		
	}

}
