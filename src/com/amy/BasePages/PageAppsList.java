package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageAppsList {
	
	/**
	 * 抽取页数
	 * @return
	 */
	public UiObject getPaginalNumber() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/app_pointer");
	}
	
	/**
	 * 是否在朋友页面，验证搜索框是否在
	 * @return
	 */
	public Boolean getPaginalNumberExist() {
		Boolean isPaginalNumberExist = false;
		if(getPaginalNumber().exists()){
			isPaginalNumberExist = true;
		}
		return isPaginalNumberExist;
	}

}
