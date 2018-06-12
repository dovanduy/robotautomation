package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageFriends {
	
	/**
	 * 抽取搜索框
	 * @return
	 */
	public UiObject getSearchText() {
		return UiObjectHelper
				.getUiObjectByResourceId("android:id/search_bar");
	}
	
	/**
	 * 抽取add按钮
	 * @return
	 */
	public UiObject getAddButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("android:id/search_bar");
	}
	
	/**
	 * 是否在朋友页面，验证搜索框是否在
	 * @return
	 */
	public Boolean getSearchTextExist() {
		Boolean isSearchTextExist = false;
		if(getSearchText().exists()){
			isSearchTextExist = true;
		}
		return isSearchTextExist;
	}

}
