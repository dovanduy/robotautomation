package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageGanCaoDoctor {
	/**
	 * 抽取找医生
	 * @return
	 */
	public UiObject getFindDoctor() {
		return UiObjectHelper
				.getUiObjectByResourceId("cn.bocweb.gancao:id/llFindDoctor");
	}

	/**
	 * 是否在甘草医生页面，验证找医生是否在
	 * @return
	 */
	public Boolean getFindDoctorExist() {
		Boolean isFindDoctorExist = false;
		if(getFindDoctor().exists()){
			isFindDoctorExist = true;
		}
		return isFindDoctorExist;
	}
}
