package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageMainMenu {
	
	/**
	 * 抽取设置按钮
	 * @return
	 */
	public UiObject getSettingButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/iv_settings");
	}
	
	/**
	 * 抽取WiFi按钮
	 * @return
	 */
	public UiObject getWiFiButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/iv_wifi");
	}
	
	/**
	 * 抽取艾米开始美好生活文本
	 * @return
	 */
	public UiObject getAmyStartWondfulLifeText() {
		return UiObjectHelper
				.getUiObjectByText("艾米开启美好生活");
	}
	
	/**
	 * 抽取麦克风按钮
	 * @return
	 */
	public UiObject getMicrophoneButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/iv_mic");
	}
	
	/**
	 * 抽取电池百分比
	 * @return
	 */
	public UiObject getBatteryPercentageText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_battery_percent_text");
	}
	
	/**
	 * 抽取星期文本
	 * @return
	 */
	public UiObject getWeekText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_Week");
	}
	
	/**
	 * 抽取日期文本
	 * @return
	 */
	public UiObject getDateText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_Date");
	}
	
	/**
	 * 抽取时间文本
	 * @return
	 */
	public UiObject getTimeText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_Time");
	}
	
	/**
	 * 抽取天气按钮
	 * @return
	 */
	public UiObject getWeatherImage() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/img_weather_bg");
	}
	
	/**
	 * 抽取朋友按钮
	 * @return
	 */
	public UiObject getFriendButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/imgbt_friend");
	}
	
	/**
	 * 抽取健康医疗按钮
	 * @return
	 */
	public UiObject getHealthMedicalButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/imgbt_healthcare");
	}
	
	/**
	 * 抽取应用列表按钮
	 * @return
	 */
	public UiObject getAppsListButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/imgbt_entertainment");
	}
	
	/**
	 * 获取主界面标题
	 * @return
	 */
	public Boolean getMainMenuTitleTextExist() {
		Boolean isTitleExist = false;
		UiObject mainMenuTitleText = UiObjectHelper
				.getUiObjectByText("艾米开启美好生活");
		if(mainMenuTitleText.exists()){
			isTitleExist = true;
		}
		return isTitleExist;
	}
	
	/**
	 * 进入设置页面
	 * @return
	 */
	public void GoToSettingPage() {
		try {
			getSettingButton().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 进入天气页面
	 * @return
	 */
	public void GoToWeatherPage() {
		try {
			getWeatherImage().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 进入朋友页面
	 * @return
	 */
	public void GoToFriendsPage() {
		try {
			getFriendButton().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 进入医疗健康页面 
	 * @return
	 */
	public void GoToHealthMedicalPage() {
		try {
			getHealthMedicalButton().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 进入应用列表页面 
	 * @return
	 */
	public void GoToAppsListPage() {
		try {
			getAppsListButton().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
