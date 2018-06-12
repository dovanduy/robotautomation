package com.amy.BasePages;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class SettingPage {
	UiObject settingPageTitle = new UiObject(new UiSelector().text("机器人账户管理"));
	UiObject setNickname = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_setnick"));
	UiObject changePassword = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_motifypassword"));
	UiObject basicInfo = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_basicmessage"));
	UiObject manageAccount = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_manageaccount"));
	UiObject language = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_language"));
	UiObject speaker = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_speaker"));
	
	UiObject userlist = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_userlist"));
	UiObject leavehome = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_leavehome"));
	UiObject wallpaper = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_wallpaper"));
	UiObject mention = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_mention"));
	UiObject photo = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_photo"));
	UiObject headline = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_headline"));
	UiObject generalsetting = new UiObject(new UiSelector().resourceId("com.amyrobotics.amyrobotv1:id/tv_generalsetting"));
	
	
}
