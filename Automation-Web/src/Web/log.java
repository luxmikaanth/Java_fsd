package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class log {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "D:\\Git\\Testing\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			driver.get("https://www.shine.com/myshine/login/");
			
			WebElement mail = driver.findElement(By.id("id_email_login"));
			mail.sendKeys("Luxmikaanth@gmail.com");
			
			WebElement pass = driver.findElement(By.id("id_password"));
			pass.sendKeys("Luxmi@2222");
			
			Thread.sleep(6000);
			
			WebElement logins = driver.findElement(By.cssSelector("#cndidate_login_widget .msitelogin_mid2 .ui-btn_n"));
			logins.click();
			Thread.sleep(6000);
}
}
