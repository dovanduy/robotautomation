package com.amy.BasePages;

import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.amy.util.UiObjectHelper;

public class PageWeather {
	
	/**
	 * 抽取城市
	 * @return
	 */
	public UiObject getCityText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_detail_city");
	}
	
	/**
	 * 抽取天气
	 * @return
	 */
	public UiObject getWeatherText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_detail_weather");
	}

	/**
	 * 抽取温度
	 * @return
	 */
	public UiObject getTempText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.amyrobotics.amyrobotv1:id/tv_detail_temp");
	}
}
