package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		public static WebDriver driver;
		public static Actions a;
		public static TakesScreenshot ts;
		public static Alert a1;
		public static Robot r;
		public static JavascriptExecutor js;
		public static Select s;
		
		public static void launchBrowser() {
		
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\MagicalRingsT\\Desktop\\New folder\\SeleniumFramework\\Drivers\\msedgedriver.exe");
			driver = new ChromeDriver();
					
		}
		
		public static void toPassURL(String url) {
			driver.get(url);
		}
		
		public static void maxBrowser() {
			driver.manage().window().maximize();
		}
		
		public static void toInput(WebElement element, String data) {
			element.sendKeys(data);
		}
		
		public static void buttonClick(WebElement element) {
			element.click();
		}
		
		public static void toPrintGetText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		
		public static void toPerformMouseHover(WebElement element) {
			a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		
		public static void toPerformDragAndDrop(WebElement element, WebElement element1) {
			a.dragAndDrop(element, element1).perform();
			
		}
		
//		public static void toPrintGetAttribute(WebElement element, String givendata) {
//			String attribute = element.getAttribute(givendata);
//			System.out.println(attribute);
//		}
		
		public static String toPrintGetAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		}
		
		public static void toTakesScreenShot(String filename) throws IOException {
			ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\MagicalRingsT\\Desktop\\New folder\\SeleniumFramework\\TakeScreenShot\\"+filename+"\\.png");
			FileUtils.copyFile(src, dest);
		}
		
		public static void quitBrowser() {
			driver.quit();
		}
		
		public static void closeBrowser() {
			driver.close();
		}
		
		public static void toGetCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
		
		public static void toGetTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		public static void toDoubleClick() {
			a.doubleClick().perform();
		}
		
		public static void toRightClick() {
			a.contextClick().perform();
		}
		
		public static void toKeyDown() throws AWTException {
			r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		public static void toKeyUp() {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		
		public static void toKeyTab() {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		public static void toKeyEnter() {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void toJavaSet(WebElement element) {
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','usertext')", element);
		}
		
		public static void toJavaGet(WebElement element) {
			js.executeScript("arguments[0].getAttribute('value')", element);
		}

		public static void toJavaClick (WebElement element) {
			js.executeScript("arguments[0].click()", element);
		}
		
		public static void toJavaScrollDown (WebElement element) {
			js.executeScript("arguments[0].scrollINtoView('true')", element);
		}
		
		public static void toJavaScrollUp (WebElement element) {
			js.executeScript("arguments[0].scrollINtoView('false')", element);
		}
		
		public static void toAlertAccept() {
			a1=driver.switchTo().alert();
			a1.accept();
		}
		
		public static void toAlertDismiss() {
			a1.dismiss();
		}
		
		public static void toAlertSendKeys(WebElement element, String data) {
			a1.sendKeys(data);
		}
		public static void toAlertGetText() {
			String text = a1.getText();
			System.out.println(text);
		}
		
		public static void toSelectByValue(WebElement element, String text) {
			s.selectByValue(text);
		}
		
		public static void toSelectById(WebElement element, int data) {
			s.selectByIndex(data);
		}
		
		public static void toSelectByVisible(WebElement element, String text) {
			s.selectByVisibleText(text);
		}
		
		public static void toIsMultiple() {
			System.out.println(s.isMultiple());
		}
		
		public static void toGetOptions() {
			s.getOptions();
		}
		
		public static void toGetAll() {
			s.getAllSelectedOptions();
		}
		
		public static void toGetFirst() {
			s.getFirstSelectedOption();
		}
		
		public static void toDeselectByIndex(WebElement element, int value) {
			s.deselectByIndex(value);
		}
		
		public static void toDeselectByValue(WebElement element, String text) {
			s.deselectByValue(text);
		}
		
		public static void toDeselectByVisible(WebElement element, String text) {
			s.deselectByVisibleText(text);
		}
		
		public static void toDeselectAll() {
			s.deselectAll();
		}
		
		public static void toImplicitWait() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		///////////////////////////////////==> Excel 
		
		public static String excelRead(int row, int cell, String sheetNo ) throws IOException {
			
			File file=new File("C:\\Users\\MagicalRingsT\\Desktop\\New folder\\Framework1\\Datas\\Book1.xlsx");
			
			FileInputStream f=new FileInputStream(file);
			
			Workbook w=new XSSFWorkbook(f);
			
			Sheet s = w.getSheet(sheetNo);
			
					Row r = s.getRow(row);
								
					Cell c = r.getCell(cell);
					
					int cellType = c.getCellType();
					
					//if celltype==1 it will return string else other then 1 may be
					
					String value;
					
					if (cellType==1) {
						
						 value = c.getStringCellValue();
						
					}
					
					else if (DateUtil.isCellDateFormatted(c)) {
					
						Date d = c.getDateCellValue();
						
						SimpleDateFormat s1=new SimpleDateFormat("dd/MM/YYYY");
						
						 value = s1.format(d);
						
					}
					
					else {
						
						double nv = c.getNumericCellValue();
						
						//Typecating
						
						long l=(long)nv;
						
						 value = String.valueOf(l);
						
						}
					return value;
					
					
									
		}
		
}
