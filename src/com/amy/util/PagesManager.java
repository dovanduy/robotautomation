package com.amy.util;

import com.amy.BasePages.*;


public class PagesManager {
	PageLogin pageLogin;
	PageLogout pageLogout;
	PageMainMenu pageMainMenu;
	PageSetting pageSetting;
	PageFriends pageFriends;
	PageHealthMedical pageHealthMedical;
	PageAppsList pageAppsList;
	PageMultitaskManagement pageMultitaskManagement;
	PageWeather pageWeather;
	PageGanCaoDoctor pageGanCaoDoctor;

	
	public PageLogin getPageLogin(){
		if(pageLogin == null){
			pageLogin = new PageLogin();
		}
		return pageLogin;
	}
	
	
	
	public PageLogout getPageLogout(){
		if(pageLogout == null){
			pageLogout = new PageLogout();
		}
		return pageLogout;
	}

	public PageMainMenu getPageMainMenu(){
		if(pageMainMenu == null){
			pageMainMenu = new PageMainMenu();
		}
		return pageMainMenu;
	}
	
	public PageSetting getPageSetting(){
		if(pageSetting == null){
			pageSetting = new PageSetting();
		}
		return pageSetting;
	}
	
	public PageFriends getPageFriends(){
		if(pageFriends == null){
			pageFriends = new PageFriends();
		}
		return pageFriends;
	}
	
	public PageHealthMedical getPageHealthMedical(){
		if(pageHealthMedical == null){
			pageHealthMedical = new PageHealthMedical();
		}
		return pageHealthMedical;
	}
	public PageAppsList getPageAppsList(){
		if(pageAppsList == null){
			pageAppsList = new PageAppsList();
		}
		return pageAppsList;
	}
	public PageMultitaskManagement getPageMultitaskManagement(){
		if(pageMultitaskManagement == null){
			pageMultitaskManagement = new PageMultitaskManagement();
		}
		return pageMultitaskManagement;
	}
	public PageWeather getPageWeather(){
		if(pageWeather == null){
			pageWeather = new PageWeather();
		}
		return pageWeather;
	}
	
	public PageGanCaoDoctor getPageGanCaoDoctor(){
		if(pageGanCaoDoctor == null){
			pageGanCaoDoctor = new PageGanCaoDoctor();
		}
		return pageGanCaoDoctor;
	}
}
