package com.amy.util;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class Voice {
	
	public void Speech(String message){
		ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");  
        try {  
            // 音量 0-100  
            sap.setProperty("Volume", new Variant(100));  
            // 语音朗读速度 -10 到 +10  
            sap.setProperty("Rate", new Variant(4));  
            // 获取执行对象  
            Dispatch sapo = sap.getObject();  
            // 执行朗读  
            Dispatch.call(sapo, "Speak", new Variant(message));  
            // 关闭执行对象  
            sapo.safeRelease();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            // 关闭应用程序连接  
            sap.safeRelease();  
        }  
	}

	public static void main(String[] args) throws InterruptedException {
		Voice voice = new Voice();
		voice.Speech("你好，艾米");
		Thread.sleep(3000);
		voice.Speech("打开甘草医生");
	}

}