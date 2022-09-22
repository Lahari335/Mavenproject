package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\lahari\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\EI13062\\Downloads\\WebTable.html");
        driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input[@type='checkbox']")).click();

	}

}
