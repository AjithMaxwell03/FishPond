package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class OrderNo extends LibGlobal{

	public OrderNo() {
		
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement OrderName;

	public WebElement getOrderName() {
		return OrderName;
	}

	

}
