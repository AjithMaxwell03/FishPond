package com.baseclass;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	// ******************WebDriver:I**************************

	public static WebDriver driver; 
	
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void quitBrowser() {
		driver.quit();
	}

	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void close() {
		driver.close();
	}

	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public Navigation navigate() {
		Navigation navigate = driver.navigate();
		return navigate;
	}

	public TargetLocator switchToElement() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	// ***********************WebElement: I***************

	public void insertText(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Throwable e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value',' " + data + " ')", element);
		}
	}

	public void btnClick(WebElement b) {
		b.click();
	}

	public String getAttribute(WebElement w, String value) {
		String attribute = w.getAttribute(value);
		return attribute;
	}

	public void getText(WebElement T) {
		T.getText();
	}

	public boolean displayed(WebElement d) {
		boolean displayed = d.isDisplayed();
		return displayed;
	}

	public boolean enabled(WebElement e) {
		boolean enabled = e.isEnabled();
		return enabled;
	}

	public boolean selected(WebElement s) {
		boolean selected = s.isSelected();
		return selected;
	}

	// *************Navigate**************

	public void refresh() {
		navigate().refresh();
	}

	public void to(String url) {
		navigate().to(url);
	}

	public void back() {
		navigate().back();
	}

	public void forward() {
		navigate().forward();
	}

	// ********************Alert*****************

	public void accept() {
		switchToElement().alert().accept();
	}

	public void dismiss() {
		switchToElement().alert().dismiss();
	}

	public void insertTextInAlert(String text) {
		switchToElement().alert().sendKeys(text);
	}

	public String getTextInAlert() {
		String text = switchToElement().alert().getText();
		return text;
	}

	// ****************Frames*************

	public void frameIndex(int index) {
		switchToElement().frame(index);
	}

	public void frameStringId(String id) {
		switchToElement().frame(id);
	}

	public void frameStringName(String name) {
		switchToElement().frame(name);
	}

	public void frameWebElementRef(WebElement f) {
		switchToElement().frame(f);
	}

	public WebDriver framedefaultContent() {
		WebDriver defaultContent = switchToElement().defaultContent();
		return defaultContent;
	}

	public WebDriver parentFrame() {
		WebDriver parentFrame = switchToElement().parentFrame();
		return parentFrame;
	}

	// ************************ACTIONS : C*****************************

	Actions actions;

	public void moveToElement(WebElement target) {

		actions = new Actions(driver);
		actions.moveToElement(target).perform();

	}

	public void dragAndDrop(WebElement source, WebElement target) {
		actions.dragAndDrop(source, target).perform();
	}

	public void contextClick(WebElement target) {
		actions.contextClick(target).perform();
	}

	public void doubleClick(WebElement target) {
		actions.doubleClick(target);
	}

	// **********************SELECT:C*************************************

	

	public Select selectByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
		return select;
	}

	public void selectByValue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element,String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}

	public void deSelectByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element,String text) {
		Select select=new Select(element);
		select.deselectByValue(text);
	}

	public void deSelectByVisibleText(WebElement element,String text){
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectAll(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();
	}

	public List<WebElement> getOptions(WebElement element) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select=new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getFirstSelectedOptions(WebElement element) {
		Select select=new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public boolean isMultiple(WebElement element) {
		Select select=new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}



}
