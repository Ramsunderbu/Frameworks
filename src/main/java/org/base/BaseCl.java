package org.base;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.math.BigDecimal;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.List;
	import java.util.Properties;
	import java.util.Set;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseCl {
		
			public static WebDriver driver;

			public void getDriver() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			public void enterApplnUrl(String url) {
				driver.get(url);
			}

			public void maximizeWindow() {
				driver.manage().window().maximize();
			}

			public void elementSendKeys(WebElement element, String data) {
				element.sendKeys(data);
			}

			public void elementSendKeysJs(WebElement element, String data) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguements[0].setAttribute('value','" + data + "')", element);
			}

			public void elementclick(WebElement element) {
				element.click();
			}

			public String getWindowTitle() {
				String title = driver.getTitle();
				return title;
			}

			public WebElement findElementById(String attributeValue) {
				WebElement element = driver.findElement(By.id(attributeValue));
				return element;
			}

			public WebElement findElementByName(String attributeValue) {
				WebElement element = driver.findElement(By.name(attributeValue));
				return element;
			}

			public WebElement findElementByClassName(String attributeValue) {
				WebElement element = driver.findElement(By.className(attributeValue));
				return element;
			}

			public WebElement findElementByXpath(String attributeValue) {
				WebElement element = driver.findElement(By.xpath(attributeValue));
				return element;
			}

			public WebElement findElementByCssSelector(String attributeValue) {
				WebElement element = driver.findElement(By.cssSelector(attributeValue));
				return element;
			}

			public WebElement findElementBylinkText(String attributeValue) {
				WebElement element = driver.findElement(By.linkText(attributeValue));
				return element;
			}

			public WebElement findElementByPartialLinkText(String attributeValue) {
				WebElement element = driver.findElement(By.partialLinkText(attributeValue));
				return element;
			}

			public WebElement findElementByTagName(String attributeValue) {
				WebElement element = driver.findElement(By.tagName(attributeValue));
				return element;
			}

			public void closeWindow() {
				driver.close();
			}

			public void quitWindow() {
				driver.quit();
			}

			public String elementGetText(WebElement element) {
				String text = element.getText();
				return text;
			}

			// 99% value --> get inserted value from textbox
			public String elementGetAttributeValue(WebElement element) {
				String attribute = element.getAttribute("value");
				return attribute;
			}

			// 1% value --> get inserted value from textbox
			public String elementGetAttributeValue(WebElement element, String attributeName) {
				String attribute = element.getAttribute(attributeName);
				return attribute;
			}

			public void SelectOptionByText(WebElement element, String text) {
				Select select = new Select(element);
				select.selectByVisibleText(text);
			}

			public void SelectOptionByAttribute(WebElement element, String value) {
				Select select = new Select(element);
				select.selectByValue(value);
			}

			public void SelectOptionByIndex(WebElement element, int index) {
				Select select = new Select(element);
				select.selectByIndex(index);
			}

			public String getOptions(WebElement element) {
				Select select = new Select(element);
				List<WebElement> options = select.getOptions();
				WebElement webElement = options.get(5);
				String text = webElement.getText();
				return text;
			}

			public String getAllSelectedOptions(WebElement element) {
				Select select = new Select(element);
				List<WebElement> options = select.getAllSelectedOptions();
				String text = options.get(1).getText();
				return text;
			}

			public String getFirstSelectedOption(WebElement element) {
				Select select = new Select(element);
				WebElement options = select.getFirstSelectedOption();
				String text = options.getText();
				return text;
			}

			public void isMultiple(WebElement element) {
				Select select = new Select(element);
				select.isMultiple();
			}

			public void deSelectOptionByText(WebElement element, String text) {
				Select select = new Select(element);
				select.deselectByVisibleText(text);
			}

			public void deSelectOptionByAttribute(WebElement element, String value) {
				Select select = new Select(element);
				select.deselectByValue(value);
			}

			public void deSelectOptionByIndex(WebElement element, int index) {
				Select select = new Select(element);
				select.deselectByIndex(index);
			}

			public void deSelectAll(WebElement element) {
				Select select = new Select(element);
				select.deselectAll();
			}

			public String elementGetText(WebElement element, String value) {
				String text = element.getAttribute(value);
				return text;
			}

			public void minimizeWindow() {
				driver.manage().window().minimize();
			}

			public void elementClickButtonByJs(WebElement element) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguements[0].click()", element);
			}

			public void clickOkAlert() {
				driver.switchTo().alert().accept();
			}

			public void clickCancelAlert() {
				driver.switchTo().alert().dismiss();
			}

			public void AcceptAndOkAlert(String data) {
				driver.switchTo().alert().sendKeys(data);
				driver.switchTo().alert().accept();
			}

			public void SwtichToFrameByIndex(int index) {
				driver.switchTo().frame(index);
			}

			public void SwitchToFrameById(String id) {
				driver.switchTo().frame(id);
			}

			public void SwitchToMainPageFromFrame() {
				driver.switchTo().defaultContent();
			}

			public String GetParentWindowId() {
				String id = driver.getWindowHandle();
				return id;
			}

			public Set<String> getAllWindowsId() {
				Set<String> id = driver.getWindowHandles();
				return id;
			}

			public void SwitchToWindowById(String Id) {
				driver.switchTo().window(Id);
			}

			public void SwitchToWindowByTitle(String title) {
				driver.switchTo().window(title);
			}

			public void SwitchTowindowByUrl(String url) {
				driver.switchTo().window(url);
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

			public void navigateToUrl(String url) {
				driver.navigate().to(url);
			}

			public void moveToElement(WebElement element) {
				Actions action = new Actions(driver);
				action.moveToElement(element).perform();
			}

			public void dragAndDrop(WebElement element1, WebElement element2) {
				Actions action = new Actions(driver);
				action.dragAndDrop(element1, element2).perform();
			}

			public void takeScreenShot(WebElement element) {
				File a = element.getScreenshotAs(OutputType.FILE);
			}

			public void rightClick(WebElement element) {
				Actions action = new Actions(driver);
				action.contextClick(element).perform();
			}

			public void doubleClick(WebElement element) {
				Actions action = new Actions(driver);
				action.doubleClick(element).perform();
			}

			public String getPageSource() {
				String text = driver.getPageSource();
				return text;
			}

			public String getTagName(WebElement element) {
				String text = element.getTagName();
				return text;
			}

			public String getCssValue(WebElement element, String value) {
				String text = element.getCssValue(value);
				return text;
			}

			public Dimension getSize(WebElement element) {
				Dimension size = element.getSize();
				return size;
			}

			public void getConnection(String url) throws SQLException {
				DriverManager.getConnection(url);
			}

			public void clear(WebElement element) {
				element.clear();
			}

			public boolean isEnabled(WebElement element) {
				boolean enabled = element.isEnabled();
				return enabled;
			}

			public boolean isDisplayed(WebElement element) {
				boolean displayed = element.isDisplayed();
				return displayed;
			}

			public void submit(WebElement element) {
				element.submit();
			}

			public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
				String data = "";
				File file = new File("C:\\Users\\Sabari\\eclipse-workspace\\frameWorks\\src\\test\\java\\TestData.xlsx");
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet(sheetName);
				Row row = sheet.getRow(rowNum);
				Cell cell = row.getCell(cellNum);
				CellType type = cell.getCellType();

				switch (type) {
				case STRING:
					data = cell.getStringCellValue();
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
						data = dateFormat.format(dateCellValue);
					} else {
						double numericCellValue = cell.getNumericCellValue();
						BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
						data = valueOf.toString();
					}
					break;
				default:
					break;
				}
				workbook.close();
				return data;
				
				
			}

			public String updateCellData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
					throws IOException {
				File file = new File("C:\\Users\\romar\\eclipse-workspace\\Framework\\Excel\\TestData.xlsx");
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet(sheetName);
				Row row = sheet.getRow(rowNum);
				Cell cell = row.getCell(cellNum);
				String value = cell.getStringCellValue();
				if (value.equals(oldData)) {
					cell.setCellValue(newData);
				}
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				workbook.write(fileOutputStream);
				return newData;
			}

			public String createCellInsertData(String sheetName, int rowNum, int cellNum, String data) throws IOException {
				File file = new File("C:\\Users\\Sabari\\eclipse-workspace\\frameWorks\\src\\test\\java\\TestData.xlsx");
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet(sheetName);
				Row row = sheet.getRow(rowNum);
				Cell cell = row.createCell(cellNum);
				cell.setCellValue(data);
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				workbook.write(fileOutputStream);
				return data;
			}
			
			public String getDataLong(String sheetname,int rownum,int cellnum) throws IOException 
			{
				String res="";
				File file=new File("C:\\Users\\Sabari\\eclipse-workspace\\frameWorks\\src\\test\\java\\TestData.xlsx");
				FileInputStream fis=new FileInputStream(file);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet sheet=wb.getSheet(sheetname);
				Row row=sheet.getRow(rownum);
				Cell cell=row.getCell(cellnum);
				CellType type=cell.getCellType();
				
				switch(type)
				{
				case STRING:
					res=cell.getStringCellValue();
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell))
					{
						Date datecellvalue=cell.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
						res=dateFormat.format(datecellvalue);
					}
					else 
					{
					double d=cell.getNumericCellValue();
					long l=(long) d;
					res=String.valueOf(l);
					}
					break;
				}
				return res;

			}
			
			public static String getPropertyFileValue (String Key) throws FileNotFoundException, IOException {
				Properties properties = new Properties();
				properties.load(new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties"));
				String value = (String)properties.get(Key);
				return value;
			}
			
			public static void getDriver (String browserType) {
				switch (browserType) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
				case "ie":
					WebDriverManager.iedriver().setup();
					driver = new InternetExplorerDriver();
					break;
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;

				default:
					break;
				}
			}
			
			public static String getprojectPath () {
				String path = System.getProperty("user.dir");
				return path;
			}
		}



