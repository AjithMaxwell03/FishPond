package com.stepdefinition;

import com.baseclass.LibGlobal;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HookClass extends LibGlobal{
	
	@Before
		public void beforeExecution() {	
		launchBrowser();
		maximizeWindow();
		loadUrl("https://adactinhotelapp.com/");
	}	

	@After
	public void afterExcecution() {
	}
}
