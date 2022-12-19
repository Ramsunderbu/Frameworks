package frameWorks;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Bk extends BaseClass{

			public void book() throws IOException, InterruptedException {
				
				//Login
				
				getDriver();
				
				getUrl("https://adactinhotelapp.com/");
				
				maximize();		
				
				WebElement txtUser = byid("username");		
				String data = getData("Adactin", 1, 0);		
				sendKeys(txtUser,data);	
				
				WebElement txtPass = byid("password");		
				String data2 = getData("Adactin", 1, 1);		
				sendKeys(txtPass, data2);	
				
				WebElement loginBtn = byid("login");		
				click(loginBtn);
				
				//Search Hotel
				
				WebElement locationSelect = byid("location");
				String data3 = getData("Adactin", 1, 2);
				selectByVisibleText(locationSelect,data3);
				
				WebElement hotelSelect = byid("hotels");
				String data4 = getData("Adactin", 1, 3);
				selectByVisibleText(hotelSelect,data4);
				
				WebElement roomSelect = byid("room_type");
				String data5 = getData("Adactin", 1, 4);
				selectByVisibleText(roomSelect, data5);
				
				WebElement roomNos = byid("room_nos");
				String data6 = getData("Adactin", 1, 5);
				selectByVisibleText(roomNos, data6);
				
				WebElement chechIn = byid("datepick_in");
//				clear(chechIn);
				String data7 = getData("Adactin", 1, 6);
				sendKeys(chechIn, data7);
				
				WebElement checkOut = byid("datepick_out");
//				clear(checkOut);
				String data8 = getData("Adactin", 1, 7);
				sendKeys(checkOut, data8);
				
				WebElement adultNos = byid("adult_room");
				String data9 = getData("Adactin", 1, 8);
				selectByVisibleText(adultNos, data9);
				
				WebElement childNos = byid("child_room");
				String data10 = getData("Adactin", 1, 9);
				selectByVisibleText(childNos, data10);
				
				WebElement submitBtn = byid("Submit");
				click(submitBtn);
				
				//Select Hotel
				
				WebElement selectHotel = byid("radiobutton_0");
				click(selectHotel);
				
				WebElement continueBtn = byid("continue");
				click(continueBtn);
				
				//Book A Hotel
				
				WebElement txtFirstName = byid("first_name");
				String data11 = getData("Adactin", 1, 10);
				sendKeys(txtFirstName, data11);
				
				WebElement txtLastName = byid("last_name");
				String data12 = getData("Adactin", 1, 11);
				sendKeys(txtLastName, data12);
				
				WebElement billingAddress = byid("address");
				String data13 = getData("Adactin", 1, 12);
				sendKeys(billingAddress, data13);
				
				WebElement creditCardNum = byid("cc_num");
				String data14 = getData("Adactin", 1, 13);
				sendKeys(creditCardNum, data14);
				
				WebElement cardType = byid("cc_type");
				String data15 = getData("Adactin", 1, 14);
				selectByVisibleText(cardType, data15);
				
				WebElement expMonth = byid("cc_exp_month");
				String data16 = getData("Adactin", 1, 15);
				selectByVisibleText(expMonth, data16);
				
				WebElement expYear = byxpath("//select[@id='cc_exp_year']");
				Select s = new Select(expYear);
				s.selectByValue("2022");

				
				WebElement txtCvv = byid("cc_cvv");
				String data18 = getData("Sheet2", 1, 17);
				sendKeys(txtCvv, data18);
				
				WebElement bookBtn = byid("book_now");
				click(bookBtn);
				
				Thread.sleep(4000);
				
				
				
				WebElement orderNo = byid("order_no");
//				String elementGetAttributeValue = getAttribute(element);
				
				
				
//				String createCellInsertData = createCellInsertData("Sheet2", 1, 18, elementGetAttributeValue);
				
				
			}

			private String getData(String string, int i, int j) {
				
				return null;
			}

			public static void main(String[] args) throws IOException, InterruptedException {
				Bk b = new Bk();
				b.book();
			}

		
	}
	



