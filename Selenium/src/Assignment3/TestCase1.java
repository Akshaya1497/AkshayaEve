package Assignment3;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launching browser
		driver.manage().window().maximize();// maximizing browser
		driver.get("https://demo.actitime.com/login.do"); // loading url
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		userName.sendKeys("admin");
		password.sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content selected tt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
		Thread.sleep(4000);
		//WebElement Cname = driver.findElement(By.xpath("//div[@class='selectedItem']/div[contains(.,'- Select Customer -')]"));
		WebElement Cname = driver.findElement(By.xpath("//div[@class='comboboxButton focused']/div[@class='searchInputPlaceholder']"));
		Thread.sleep(2000);
		Select S=new Select(Cname);
		S.selectByVisibleText("- New Customer -");
		
}
}
