package com.amy.testcase.speechInteractive;

import com.amy.util.BasicTestCase;
import com.amy.util.SocketClient;
import com.amy.util.TaskThread;

public class TestCase1_OpenApp extends BasicTestCase{
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase1(){
		//SocketClient socketClient = new SocketClient();
		for(int i=0;i<10;i++){
			
			SocketClient socketClient = new SocketClient();
			socketClient.SendMessage("TestCase1_OpenApp");
			sleep(6000);
			Boolean actual = pm.getPageGanCaoDoctor().getFindDoctorExist();
			if(actual.equals(true)){
				break;
			}
		}
		
		sleep(10000);
		Boolean expect = true;
		Boolean actual = pm.getPageGanCaoDoctor().getFindDoctorExist();
		assertEquals(expect,actual);
		getUiDevice().pressBack();
		sleep(1000);
		getUiDevice().pressBack();
		
	}

}
