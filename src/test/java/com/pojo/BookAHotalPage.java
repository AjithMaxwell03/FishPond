package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.LibGlobal;

public class BookAHotalPage extends LibGlobal{

	public BookAHotalPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement LastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private  WebElement Address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private  WebElement cc_num;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private  WebElement cc_type;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private  WebElement cc_exp_month;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private  WebElement cc_exp_year;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private  WebElement cc_cvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private  WebElement bookNowbtn;

	@FindBy(xpath="//td[contains(text(),'Book A Hotel')]")
	private  WebElement bookHotelPageDiplayed;
	
	public WebElement getBookHotelPageDiplayed() {
		return bookHotelPageDiplayed;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBookNowbtn() {
		return bookNowbtn;
	}
	

}
