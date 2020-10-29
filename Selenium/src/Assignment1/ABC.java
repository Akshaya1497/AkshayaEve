package Assignment1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ABC {
	WebDriver drivere;
	@Test
	  public void Demo()   {		
		
		FileInputStream fis = new FileInputStream("./Akshaya.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String bName=p.getProperty("Browser")
			if (bName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
				drivere = new FirefoxDriver();
			}
			if (bName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
				drivere = new ChromeDriver();
			}
}
	}

