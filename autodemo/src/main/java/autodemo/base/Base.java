package autodemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\pradeep.kumar\\eclipse-workspace\\autodemo\\src\\main\\java\\autodemo\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browsername = prop.getProperty("Browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pradeep.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\pradeep.kumar\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get(prop.getProperty("url"));
	}

}
