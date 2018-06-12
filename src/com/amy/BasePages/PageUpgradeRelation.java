package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageUpgradeRelation {
	
	/**
	 * 抽取升级按钮
	 * @return
	 */
	public UiObject getUpgradeButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.android.amyrobotics.videochat:id/bt_left");
	}
	
	/**
	 * 抽取取消按钮
	 * @return
	 */
	public UiObject getCancelButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.android.amyrobotics.videochat:id/bt_right");
	}

}
