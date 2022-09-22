package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		        System.setProperty("webdriver.chrome.driver", "C:\\lahari\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.facebook.com/signup");
		        Thread.sleep(500);
		        driver.findElement(By.name("firstname")).sendKeys("lahari");
		        driver.findElement(By.name("lastname")).sendKeys("poojari");
		        driver.findElement(By.name("reg_email__")).sendKeys("11991919919");
		        driver.findElement(By.name("reg_passwd__")).sendKeys("lalala");
		        driver.findElement(By.name("birthday_day")).sendKeys("18");
		        driver.findElement(By.name("birthday_month")).sendKeys("nov");
		        driver.findElement(By.name("birthday_year")).sendKeys("2000");
		        driver.findElement(By.tagName("label")).click();
		        driver.findElement(By.name("websubmit")).click();

	}

}
