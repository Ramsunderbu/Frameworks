package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	  
    public void getDriver() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
    public void getcurrenturl() {
    	driver.getCurrentUrl();
    }
	public void maximize() {
	driver.manage().window().maximize();
	} 
	public void getUrl(String url) {
	driver.get(url);
	}
	public void getDataFromCell() {
		

	}
	public String getTitle() {
	String title = driver.getTitle();
	return title;	
	}
	public WebElement byid(String id) {
	WebElement findElement = driver.findElement(By.id(id));
	return findElement;	
	}
	public WebElement byxpath(String xpath) {
	WebElement findElement = driver.findElement(By.xpath(xpath));
	return findElement;	
	}
    public WebElement byname(String name) {
	WebElement findElement = driver.findElement(By.name(name));
    return findElement;	
	}
    public void sendKeys(WebElement element,String value) {
	element.sendKeys(value);
	}
	public void click(WebElement element) {
	element.click();
	}
    public void getAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	System.out.println(attribute);
	}
    public void gettext(WebElement element) {
	String text = element.getText();
	System.out.println(text);
	}
	public void movetoelement(WebElement element,String xpath) {
	Actions c = new Actions(driver);
	c.moveToElement(element).perform();
	driver.findElement(By.xpath(xpath)).click();
	}
    public void draganddrop(WebElement source,WebElement destination) {
	Actions x=new Actions(driver);
	x.dragAndDrop(source, destination).perform();
	}
    public void screenshot(String path) throws Exception {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	File file = new File(path);
	FileUtils.copyFile(screenshotAs, file);
	}
    public void keyboardactions(Keys shift,WebElement element,String input) {
	Actions actions =new Actions(driver);
	actions.keyDown(shift).sendKeys(element,input).keyUp(shift).perform();
	}
	public void doubleclick(WebElement element) {
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
	}
    public void alertaccept() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
    public void alertdismiss() {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	}
	public Alert alert(String input) {
	Alert alert = driver.switchTo().alert();
	return alert;
	}
	public void jssetattribute(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value',’ramsunder')", element);
	}
    public void jsgetattribute(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Object executeScript = js.executeScript("arguments[0].getAttribute('value')", element);
	String string = executeScript.toString();
	System.out.println(string);
	}
	public void jsclick(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",element);
	}
	public void frameid(String id) {
	driver.switchTo().frame(id);
	}
	public void frameelement(WebElement element) {
	driver.switchTo().frame(element);
	}
    public void frameindex(int index) {
	driver.switchTo().frame(index);
	}
    public void parentframe() {
	driver.switchTo().parentFrame();
	}
    public List<WebElement> noofframes(String id) {
	List<WebElement>list = (List<WebElement>) driver.findElement(By.tagName(id));
	int size = list.size();
	System.out.println(size);
	return list;
	}
    public void childWindow() {
	String parent = driver.getWindowHandle();
	Set<String>both = driver.getWindowHandles();
	for (String x : both) {
	if(!parent.equals(x)) {
	driver.switchTo().window(x);
	}}}
    public void backToParentWindow() {
	String parent = driver.getWindowHandle();
	Set<String>both = driver.getWindowHandles();
	for (String x : both) {
	if(parent.equals(x)) {
	driver.switchTo().window(x);
	}}}
    public void windowhandling(int index) {
	Set<String>windowHandles = driver.getWindowHandles();
	List<String>li = new ArrayList<String>();
	li.addAll(windowHandles);
	String x = li.get(index);
	driver.switchTo().window(x);
	}
    public void navigateTo(String url) {
	driver.navigate().to(url);
	}
    public void navigateBack() {
	driver.navigate().back();
	}
    public void navigateForward() {
	driver.navigate().forward();
	}
    public void navigateRefresh() {
	driver.navigate().refresh();
	}
    public void selectByIndex(WebElement element,int index) {
	Select s = new Select(element);
	s.selectByIndex(index);
	}
    public void selectByValue(WebElement element,String value) {
	Select s = new Select(element);
	s.selectByValue(value);
	}
    public void selectByVisibleText(WebElement element,String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}
	public void deselectAll(WebElement element) {
	Select s = new Select(element);
	s.deselectAll();
	}

    public void deselectByIndex(WebElement element,int index) {
	Select s = new Select(element);
	s.deselectByIndex(index);
	}
	public void deselectByValue(WebElement element,String value) {
	Select s = new Select(element);
    s.deselectByValue(value);
	}
	public void deselectByVisibleText(WebElement element,String text) {
	Select s = new Select(element);
	s.deselectByVisibleText(text);
	
	}
    public boolean isMultiple (WebElement element) {
	Select s = new Select(element);
	boolean b = s.isMultiple();	
	return b;	
	}
    public void getfirstselectedoption(WebElement element) {
	Select s = new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption);
	}
	public void getoptions(WebElement element) {
	Select s = new Select(element);
	List<WebElement>options = s.getOptions();
	for(int i=0;i<options.size();i++) {
	options.get(i);
	}}
	public void jsscrolldown(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].Scrollintoview(true)",element);
	}
	public void jsscrollup(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].Scrollintoview(false)",element);
	}
	public void nooftables() {
	List<WebElement>findElements = driver.findElements(By.tagName("table"));
	int size = findElements.size();
	System.out.println(size);
	}
	public void gettextxt(int index) {
	List<WebElement>findElements = driver.findElements(By.tagName("table"));
	WebElement a = findElements.get(index);
	List<WebElement>findElements2 = a.findElements(By.tagName("tr"));
	for (WebElement x : findElements2) {
	String text = x.getText();
	System.out.println(text);
	}}
    public void gettextweb(int index) {
	List<WebElement>e = driver.findElements(By.tagName("table"));
    WebElement ee = e.get(index);
	String text = ee.getText();
	System.out.println(text);
	}
    public void quit() {
	driver.quit();
	}
    public void close() {
	driver.close();
	}
    public String getDataFromCel(String sheetName, int rowNum, int cellNum) throws IOException {
    	String data ="";
    	File file = new File("C:\\Users\\Sabari\\eclipse-workspace\\frameWorks\\src\\test\\java\\TestData.xlsx");
    	FileInputStream fileInputStream =new FileInputStream(file);
    	Workbook workbook = new XSSFWorkbook(fileInputStream);
    	Sheet sheet = workbook.getSheet("Sheet2");
    	Row row = sheet.getRow(rowNum);
    	Cell cell = row.getCell(cellNum);
    	CellType cellType = cell.getCellType();
		return data;
		

	}
 
    

}
