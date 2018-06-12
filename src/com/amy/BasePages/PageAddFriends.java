package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageAddFriends {
	
	/**
	 * 抽取搜索框
	 * @return
	 */
	public UiObject getSearchBar() {
		return UiObjectHelper
				.getUiObjectByResourceId("android:id/search_bar");
	}
	
	/**
	 * 抽取搜索按钮
	 * @return
	 */
	public UiObject getSearchButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("android:id/search_button");
	}
	
	/**
	 * 抽取添加按钮
	 * @return
	 */
	public UiObject getAddButton() {
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
