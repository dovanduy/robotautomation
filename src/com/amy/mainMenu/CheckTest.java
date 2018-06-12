package com.amy.mainMenu;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.android.uiautomator.core.UiObjectNotFoundException;
import android.os.RemoteException;

public class CheckTest extends UiAutomatorTestCase {   
   public void testDemo() throws UiObjectNotFoundException, RemoteException {   

	   getUiDevice().unfreezeRotation();
	   getUiDevice().setOrientationLeft();
	   getUiDevice().setOrientationRight();
	   getUiDevice().setOrientationNatural();
      
   }
}
