package frameWorks;

import java.io.IOException;

import org.base.BaseCl;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Booking  extends BaseCl{
public void book() throws IOException, InterruptedException {
		
		//Login
		
		getDriver();
		
		enterApplnUrl("https://adactinhotelapp.com/");
		
		maximizeWindow();		
		
		WebElement txtUser = findElementById("username");		
		String data = getData("Sheet2", 1, 0);		
		elementSendKeys(txtUser,data);	
		
		WebElement txtPass = findElementById("password");		
		String data2 = getData("Sheet2", 1, 1);		
		elementSendKeys(txtPass, data2);	
		
		WebElement loginBtn = findElementById("login");		
		elementclick(loginBtn);
		
		//Search Hotel
		
		WebElement locationSelect = findElementById("location");
		String data3 = getData("Sheet2", 1, 2);
		SelectOptionByText(locationSelect,data3);
		
		WebElement hotelSelect = findElementById("hotels");
		String data4 = getData("Sheet2", 1, 3);
		SelectOptionByText(hotelSelect,data4);
		
		WebElement roomSelect = findElementById("room_type");
		String data5 = getData("Sheet2", 1, 4);
		SelectOptionByText(roomSelect, data5);
		
		WebElement roomNos = findElementById("room_nos");
		String data6 = getData("Sheet2", 1, 5);
		SelectOptionByText(roomNos, data6);
		
		WebElement chechIn = findElementById("datepick_in");
		clear(chechIn);
		String data7 = getData("Sheet2", 1, 6);
		elementSendKeys(chechIn, data7);
		
		WebElement checkOut = findElementById("datepick_out");
		clear(checkOut);
		String data8 = getData("Sheet2", 1, 7);
		elementSendKeys(checkOut, data8);
		
		WebElement adultNos = findElementById("adult_room");
		String data9 = getData("Sheet2", 1, 8);
		SelectOptionByText(adultNos, data9);
		
		WebElement childNos = findElementById("child_room");
		String data10 = getData("Sheet2", 1, 9);
		SelectOptionByText(childNos, data10);
		
		WebElement submitBtn = findElementById("Submit");
		elementclick(submitBtn);
		
		//Select Hotel
		
		WebElement selectHotel = findElementById("radiobutton_0");
		elementclick(selectHotel);
		
		WebElement continueBtn = findElementById("continue");
		elementclick(continueBtn);
		
		//Book A Hotel
		
		WebElement txtFirstName = findElementById("first_name");
		String data11 = getData("Sheet2", 1, 10);
		elementSendKeys(txtFirstName, data11);
		
		WebElement txtLastName = findElementById("last_name");
		String data12 = getData("Sheet2", 1, 11);
		elementSendKeys(txtLastName, data12);
		
		WebElement billingAddress = findElementById("address");
		String data13 = getData("Sheet2", 1, 12);
		elementSendKeys(billingAddress, data13);
		
		WebElement creditCardNum = findElementById("cc_num");
		String data14 = getData("Sheet2", 1, 13);
		elementSendKeys(creditCardNum, data14);
		
		WebElement cardType = findElementById("cc_type");
		String data15 = getData("Sheet2", 1, 14);
		SelectOptionByText(cardType, data15);
		
		WebElement expMonth = findElementById("cc_exp_month");
		String data16 = getData("Sheet2", 1, 15);
		SelectOptionByText(expMonth, data16);
		
		WebElement expYear = findElementByXpath("//select[@id='cc_exp_year']");
		Select s = new Select(expYear);
		s.selectByValue("2022");
//		String data17 = getData("Sheet2", 1, 16);
//		SelectOptionByText(expYear, data17);
		
		WebElement txtCvv = findElementById("cc_cvv");
		String data18 = getData("Sheet2", 1, 17);
		elementSendKeys(txtCvv, data18);
		
		WebElement bookBtn = findElementById("book_now");
		elementclick(bookBtn);
		
		Thread.sleep(6000);
		
		//Order Id
		
		WebElement orderNo = findElementById("order_no");
		String elementGetAttributeValue = elementGetAttributeValue(orderNo);
		
		//Write Data On Excel
		
		String createCellInsertData = createCellInsertData("Sheet2", 1, 18, elementGetAttributeValue);
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Booking b = new Booking();
		b.book();
	}


}
