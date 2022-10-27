package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class SearchHotelsPage extends LibGlobal{

	public SearchHotelsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement Location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement Hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement RoomType;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement Searchbtn;
	
	@FindBy(xpath="//td[contains(text(),'Search Hote')]")
	private WebElement searchHotelPageisDisplayed;

	public WebElement getSearchHotelPageisDisplayed() {
		return searchHotelPageisDisplayed;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getSearchbtn() {
		return Searchbtn;
	}
	
	
	
	
	
	
}
