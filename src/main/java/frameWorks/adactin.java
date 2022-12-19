package frameWorks;

import java.io.IOException;

import org.base.BaseCl;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class adactin extends BaseCl{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		adactin a =new adactin();
		a.booking();
	}
	public void booking() throws IOException, InterruptedException {
		getDriver();
		
		enterApplnUrl("https://adactinhotelapp.com/");
		
		maximizeWindow();
		Thread.sleep(2000);
		WebElement byid = findElementById("username");
		String name = getData("Sheet2", 1, 0);
		elementSendKeys(byid, name);
		
		WebElement txtpass = findElementById("password");
		String pass = getData("Sheet2", 1, 1);
		elementSendKeys(txtpass, pass);
		
		WebElement btnlogin = findElementById("login");
		elementclick(btnlogin);
		
//		quit();
		
		

	}

}
