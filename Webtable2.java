package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\lahari\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get(" https://www.w3schools.com/html/html_tables.asp");
	        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	        WebElement name= driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]"));
	        System.out.println(""+name.getText());
	}

}
