package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageLogin {

	/**
	 * 获取登录页面amy图标
	 * @return
	 */
	public UiObject getLoginPageLogo() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/imgview_logo");
	}
	/**
	 * 抽取用户名输入框
	 * @return
	 */
	public UiObject getUserEditText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/et_username");
	}

	/**
	 * 抽取密码输入框
	 * @return
	 */
	public UiObject getPwdEditText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/et_password");
	}

	/**
	 * 抽取登录按钮
	 * @return
	 */
	public UiObject getLoginButton() {
		return UiObjectHelper.getUiObjectByText("登 录");
	}
	
	/**
	 * 抽取注册艾米账号按钮
	 * @return
	 */
	public UiObject getRegisterAmyAccountButton() {
		return UiObjectHelper.getUiObjectByText("注册艾米账号");
	}
	
	/**
	 * 抽取忘记密码按钮
	 * @return
	 */
	public UiObject getForgotPasswordButton() {
		return UiObjectHelper.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/forgot");
	}

	/**
	 * 输入用户名的方法
	 * @param username
	 */
	public void enterUserName(String username) {
		try {
			getUserEditText().clearTextField();
			getUserEditText().setText(username);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("用户名输入框对象为null");
		}
	}

	/**
	 * 输入密码的方法
	 * @param password
	 */
	public void enterPwd(String password) {
		try {
			getPwdEditText().clearTextField();
			getPwdEditText().setText(password);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("密码输入框对象为null");
		}

	}

	/**
	 * 点击登录按钮的方法
	 */
	public void clickLoginButton()  {
		try {
			getLoginButton().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("登录按钮为null");
		}
	}

	/**
	 * 获取主界面标题
	 * @return
	 */
	public Boolean getLoginButtonExist() {
		Boolean isLoginButtonExist = false;
		if(getLoginButton().exists()){
			isLoginButtonExist = true;
		}
		return isLoginButtonExist;
	}
	
	/**
	 * 登录的方法
	 * @param username 
	 * @param password 
	 */
	public void login(String username, String password) throws Exception{
		enterUserName(username);
		UiDevice.getInstance().pressEnter();
		Thread.sleep(2000);
		try {
			getPwdEditText().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterPwd(password);
		UiDevice.getInstance().pressEnter();
		Thread.sleep(2000);
		clickLoginButton();
	}

}
