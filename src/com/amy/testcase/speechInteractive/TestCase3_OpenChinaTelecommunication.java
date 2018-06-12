package com.amy.testcase.speechInteractive;

import com.amy.util.BasicTestCase;
import com.amy.util.SocketClient;

public class TestCase3_OpenChinaTelecommunication extends BasicTestCase{
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//
		super.setUp(false);
	}
	
	public void testTestCase1(){
		//SocketClient socketClient = new SocketClient();
		for(int i=0;i<3;i++){
			
			SocketClient socketClient = new SocketClient();
			socketClient.SendMessage("TestCase3_OpenChinaTelecommunication");
		}
	}


}
