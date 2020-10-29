package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YatraAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.xpath("//a[@title='Round Trip']")).click();
		WebElement Depart=driver.findElement(By.xpath("//label[@for='BE_flight_origin_city']"));
		Depart.click();
	/*	 List<WebElement> sugg = driver.findElements(By.xpath("//div[@class=\"ac_results origin_ac\"]/ul/div/div/div/li"));
			for (WebElement suggname : sugg) {
				System.out.println(suggname.getText());
			}
			sugg.get(1).click();*/
		/*driver.findElement(By.xpath("//input[@value='Search Flights']")).click();
		
		List<WebElement> Allflights = driver.findElements(
		By.xpath("//div[@class='result-set pr grid']/div/div"));
		int count=0;
		for (WebElement CountFlight : Allflights) {
			count++;
		}
		System.out.println("Total No. of Flights:" +count);
		driver.close();*/
	}
}
