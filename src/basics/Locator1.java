package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {
	
	public static void main(String args[]){
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.facebook.com";
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys("karabelnikava@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("alexdasha");
		driver.findElement(By.xpath("//input[@id = 'u_0_x']")).click();
	}

}
