package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageMultitaskManagement {
	
	/**
	 * 抽取多任务列表
	 * @return
	 */
	public UiObject getBackgroundAppthumbnail() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.android.systemui:id/task_view_thumbnail");
	}
	
	/**
	 * 是否在朋友页面，验证搜索框是否在
	 * @return
	 */
	public Boolean getBackgroundAppthumbnailExist() {
		Boolean isBackgroundAppthumbnailExist = false;
		if(getBackgroundAppthumbnail().exists()){
			isBackgroundAppthumbnailExist = true;
		}
		return isBackgroundAppthumbnailExist;
	}

}
