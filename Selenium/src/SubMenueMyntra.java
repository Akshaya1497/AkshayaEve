import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SubMenueMyntra {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		System.out.println(menus.getClass());
		System.out.println("=============================");
		Actions a = new Actions(driver);
		for (WebElement menuName : menus) {
			String name = menuName.getText();
			System.err.println(name);
			Thread.sleep(2000);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
			TakeScreenS.takeScreenS(name, driver);
			Thread.sleep(1000);
			List<WebElement> subMenues = driver.findElements(
					By.xpath("//div[@class=\"desktop-navLink\"]/div/descendant::div[@class=\"desktop-categoryContainer\"]/li"));
			for (WebElement subMenueName : subMenues) {
				System.out.println(subMenueName.getText());
			}
		}
	}

}

