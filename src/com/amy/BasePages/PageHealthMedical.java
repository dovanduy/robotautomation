package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageHealthMedical {
	
	/**
	 * 抽取确定按钮
	 * @return
	 */
	public UiObject getConfirmButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.medicaltreatment:id/sure_bt");
	}
	
	/**
	 * 抽取取消按钮
	 * @return
	 */
	public UiObject getCancelButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.medicaltreatment:id/cancle_bt");
	}
	
	/**
	 * 是否在健康医疗页面，验证确认按钮是否存在
	 * @return
	 */
	public Boolean getConfirmButtonExist() {
		Boolean isConfirmButtonExist = false;
		if(getConfirmButton().exists()){
			isConfirmButtonExist = true;
		}
		return isConfirmButtonExist;
	}

}
