package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageSetting {
	
	/**
	 * 抽取设置页文本
	 * @return
	 */
	public UiObject getSettingText() {
		return UiObjectHelper
				.getUiObjectByText("机器人账户管理");
	}

	/**
	 * 抽取设置昵称输入框
	 * @return
	 */
	public UiObject getSetNicknameText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_setnick");
	}
	
	/**
	 * 抽取修改密码输入框
	 * @return
	 */
	public UiObject getChangePasswordText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_motifypassword");
	}
	/**
	 * 抽取基本信息输入框
	 * @return
	 */
	public UiObject getBasicInfoText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_basicmessage");
	}
	/**
	 * 抽取账号管理
	 * @return
	 */
	public UiObject getAccountManagementButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_manageaccount");
	}
	/**
	 * 抽取语言
	 * @return
	 */
	public UiObject getLanguageText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_language");
	}
	/**
	 * 抽取发音人
	 * @return
	 */
	public UiObject getSpeakerButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_speaker");
	}
	
	/**
	 * 是否在设置页面
	 * @return
	 */
	public Boolean getSettingTextExist() {
		Boolean isSettingTextExist = false;
		if(getSettingText().exists()){
			isSettingTextExist = true;
		}
		return isSettingTextExist;
	}

	
	/**
	 * 跳转到账号管理页面
	 * @return
	 */
	public void goToLogoutPage() {
		try {
			getAccountManagementButton().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
