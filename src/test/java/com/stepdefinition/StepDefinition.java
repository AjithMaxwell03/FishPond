package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.LibGlobal;
import com.pojo.BookAHotalPage;
import com.pojo.LoginPage;
import com.pojo.OrderNo;
import com.pojo.SearchHotelsPage;
import com.pojo.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends LibGlobal {

	public static WebDriver driver;

	@Given("User launch adactin web Application")
	public void user_launch_adactin_web_Application()  {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("User verify login page is displayed")
	public void user_verify_login_page_is_displayed() {
		
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		boolean contains = currentUrl.contains("adactin");
		System.out.println(contains);
	}

	@When("User enters Valid UserId and Password")
	public void user_enters_Valid_UserId_and_Password() {
		LoginPage login = new LoginPage();
		insertText(login.getUserId(), "ajimax03");
		insertText(login.getPassword(), "Ajimax03*");
	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
		LoginPage login = new LoginPage();
		btnClick(login.getBtnClick());
	}

	@Then("User verify Search Hotel Page is displayed")
	public void user_verify_Search_Hotel_Page_is_displayed() {
		SearchHotelsPage search = new SearchHotelsPage();
		WebElement st = search.getSearchHotelPageisDisplayed();
		String text = st.getText();
		System.out.println(text);
		boolean contains = text.contains("Search");
		System.out.println("Search Hotel Page is Displayed - "+contains);
	}

	@When("User enters 	valid Location,Hotels and Room type")
	public void user_enters_valid_Location_Hotels_and_Room_type() {
		SearchHotelsPage search = new SearchHotelsPage();
		selectByVisibleText(search.getLocation(), "Sydney");
		selectByVisibleText(search.getHotels(), "Hotel Creek");
		selectByVisibleText(search.getRoomType(), "Standard");

	}

	@When("User click Search Hotel button")
	public void user_click_Search_Hotel_button() {
		SearchHotelsPage search = new SearchHotelsPage();
		btnClick(search.getSearchbtn());
	}

	@Then("User verify Select Hotel Page is displayed")
	public void user_verify_Select_Hotel_Page_is_displayed() {
		SelectHotel s = new SelectHotel();
		WebElement st = s.getSelectHotelPageisDisplayed();
		String text = st.getText();
		boolean contains = text.contains("Select Hotel");
		Assert.assertTrue("Select Hotel Page is Displayed - ", contains);
	}

	@When("User clicks Radio button")
	public void user_clicks_Radio_button() {
		SelectHotel select = new SelectHotel();
		btnClick(select.getSelectRadiobtn());

	}

	@When("User  clicks continue button")
	public void user_clicks_continue_button() {
		SelectHotel select = new SelectHotel();
		btnClick(select.getClickContinuebtn());
	}

	@Then("User verify Book A Hotel Page is displayed")
	public void user_verify_Book_A_Hotel_Page_is_displayed() {
		BookAHotalPage book = new BookAHotalPage();
		WebElement bookHotelPageDiplayed = book.getBookHotelPageDiplayed();
		System.out.println(bookHotelPageDiplayed.getText());
		String text = bookHotelPageDiplayed.getText();
		System.out.println("Book A Hotel Page is Diplayed - "+text.contains("Book"));
		
		
	}

	@When("User enters valid First Name,Last Name,Billing Address,Credit Card,Credit Card Type,Month,Year and CVV")
	public void user_enters_valid_First_Name_Last_Name_Billing_Address_Credit_Card_Credit_Card_Type_Month_Year_and_CVV() {
		BookAHotalPage b = new BookAHotalPage();
		insertText(b.getFirstName(), "Ajith");
		insertText(b.getLastName(), "Maxwell");
		insertText(b.getAddress(), "N0 - 24, 4th Street , Padi, Chennai -47");
		insertText(b.getCc_num(), "3432543364324350");
		selectByVisibleText(b.getCc_type(), "American Express");
		selectByVisibleText(b.getCc_exp_month(), "January");
		selectByVisibleText(b.getCc_exp_year(), "2020");
		insertText(b.getCc_cvv(), "321");
	}

	@When("User clicks Book Now button")
	public void user_clicks_Book_Now_button() throws InterruptedException {
		Thread.sleep(5000);
		BookAHotalPage b = new BookAHotalPage();
		b.getBookNowbtn().click();
	}

	@Then("User Verify Order ID is displayed")
	public void user_Verify_Order_ID_is_displayed() throws InterruptedException {
		Thread.sleep(5000);
		OrderNo c = new OrderNo();
		WebElement orderNo = c.getOrderName();
		String attribute = orderNo.getAttribute("value");
		System.out.println(attribute);
	}
//
//	@When("User enters Valid {string} and {string}")
//	public void user_enters_Valid_and(String username, String password) {
//		LoginPage login = new LoginPage();
//		insertText(login.getUserId(), username);
//		insertText(login.getPassword(), password);
//
//	}

//	@When("User enters 	valid {string} ,{string} and {string}")
//	public void user_enters_valid_and(String location, String hotel, String roomtype) {
//		SearchHotelsPage search = new SearchHotelsPage();
//		selectByVisibleText(search.getLocation(), location);
//		selectByVisibleText(search.getHotels(), hotel);
//		selectByVisibleText(search.getRoomType(), roomtype);
//
//	}
//
//	@When("User enters valid {string},{string},{string},{string},{string},{string},{string} and {string}")
//	public void user_enters_valid_and(String firstname, String lastname, String address, String cc_no, String cc_type,
//																																	String exp_month, String exp_year, String cvv) {
//		BookAHotalPage b = new BookAHotalPage();
//
//		insertText(b.getFirstName(), firstname);
//		insertText(b.getLastName(), lastname);
//		insertText(b.getAddress(), address);
//		insertText(b.getCc_num(), cc_no);
//		selectByVisibleText(b.getCc_type(), cc_type);
//		selectByVisibleText(b.getCc_exp_month(), exp_month);
//		selectByVisibleText(b.getCc_exp_year(), exp_year);
//		insertText(b.getCc_cvv(), cvv);
//
//	}

}
