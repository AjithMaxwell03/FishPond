package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement UserId;
	
	@FindBy(id="password")
	private WebElement Password;
	
	public WebElement getUserId() {
		return UserId;
	}

	public WebElement getPassword() {
		return Password;
	}

	@FindBy(id="login")
	private WebElement btnClick;

	@FindBy(xpath="//td[contains(text(),'User Login')")
	private WebElement txtContains;
	
	public WebElement getTxtContains() {
		return txtContains;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

}
