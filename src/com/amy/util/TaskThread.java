package com.amy.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import com.amy.util.Voice;

public class TaskThread {
	
	public static int PORT = 8080;  
	public void startThread(){  
        ServerSocket s = null;  
        Socket socket = null;  
        BufferedReader br = null;  
        PrintWriter pw = null;  
        Voice voice = new Voice();
        try {  
            //设定服务端的端口号  
            s = new ServerSocket(PORT);  
            System.out.println("ServerSocket Start:"+s);  
            //等待请求,此方法会一直阻塞,直到获得请求才往下走  
            while(true){  
            	socket = s.accept();  
                System.out.println("Connection accept socket:"+socket);  
                //用于接收客户端发来的请求  
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
                //用于发送返回信息,可以不需要装饰这么多io流使用缓冲流时发送数据要注意调用.flush()方法  
                pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true); 
                String str = br.readLine();  
                 
                if(str.equals("TestCase1_OpenApp")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("打开甘草医生");
            		Thread.sleep(5000);
                }
                else if(str.equals("TestCase2_OpenChinaUnicom")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("打开中国联通");
            		Thread.sleep(6000);
            		voice.Speech("请检查是否在中国联通页面");
                }
                else if(str.equals("TestCase3_OpenChinaTelecommunication")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("打开中国电信");
            		Thread.sleep(10000);
            		voice.Speech("请检查是否在中国电信页面");
                }
                else if(str.equals("TestCase4_OpenEconimicNews")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("我要看经济新闻");
            		Thread.sleep(10000);
            		voice.Speech("请检查是否在经济新闻页面");
                }
                else if(str.equals("TestCase5_OpenEntertainmentNews")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("我要看娱乐新闻");
            		Thread.sleep(10000);
            		voice.Speech("请检查是否在娱乐新闻页面");
                }
                else if(str.equals("TestCase6_OpenSportsNews")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("我要看体育新闻");
            		Thread.sleep(10000);
            		voice.Speech("请检查是否在体育新闻页面");
                }
                else if(str.equals("TestCase7_OpenMilitaryNews")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("我要看军事新闻");
            		Thread.sleep(10000);
            		voice.Speech("请检查是否在军事新闻页面");
                }
                else if(str.equals("TestCase8_OpenInternationalNews")){  	
            		voice.Speech("你好，艾米");
            		Thread.sleep(2000);
            		voice.Speech("我要看国际新闻");
            		Thread.sleep(10000);
            		voice.Speech("请检查是否在国际新闻页面");
                }
                else if(str.equals("END")){  
                    break;  
                } 
                System.out.println("Client Socket Message:"+str);  
                Thread.sleep(1000);  
                pw.println("Message Received");  
                pw.flush(); 
                try {  
                  br.close();  
                  pw.close();   
                } catch (Exception e2) {  
                    
               } 
            }  
              
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }finally{  
            System.out.println("Close.....");  
            try {   
                socket.close();  
                s.close();  
            } catch (Exception e2) {           
            }  
        }  
    }  
	public static void main(String[] args){
		TaskThread taskThread = new TaskThread();
		taskThread.startThread();
	}
}  


