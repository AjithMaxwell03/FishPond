package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.LibGlobal;

public class SelectHotel extends LibGlobal {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement SelectRadiobtn;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement ClickContinuebtn;
	
	@FindBy(xpath="//td[contains(text(),'Select Hotel')]")
	private WebElement selectHotelPageisDisplayed;
	
	public WebElement getSelectHotelPageisDisplayed() {
		return selectHotelPageisDisplayed;
	}

	public WebElement getSelectRadiobtn() {
		return SelectRadiobtn;
	}

	public WebElement getClickContinuebtn() {
		return ClickContinuebtn;
	}

}
