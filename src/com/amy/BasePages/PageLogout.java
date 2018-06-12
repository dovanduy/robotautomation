package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageLogout {
	/**
	 * 抽取确定按钮
	 * @return
	 */
	public UiObject getConfirmButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/textview_confirmdialog_positive");
	}
	
	/**
	 * 抽取取消按钮
	 * @return
	 */
	public UiObject getCancelButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/textview_confirmdialog_negative");
	}
	
	/**
	 * 退出登录的方法
	 */
	public void logout() {
		try {
			getConfirmButton().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
