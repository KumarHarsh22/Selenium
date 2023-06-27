package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyfirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div/div[3]/div/div[4]/div/a[1]")).click();
		driver.findElement(By.id("login_id")).sendKeys("rcvtutorials@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testautomation");
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		driver.close();
		

	}

}
