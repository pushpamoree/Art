package testbaseA;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebTestBaseA {
	public static WebDriver driver;
	public static Properties prop;
	
	public WebTestBaseA() {
		try {                                                         //it will give path 
			FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"/properties/config.properties");
			prop=new Properties();
			prop.load(fileInputStream); //load config file
			}
		catch (Exception e) 
		{	
			e.printStackTrace();  
			}
		}
		public void initialization()
		{                              //return value store inside browser
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome"))
			{
				System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"driver/chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
			  driver=new ChromeDriver(options);
			  
			  driver.navigate().to(prop.getProperty("uid")); //navigate to move
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.manage().deleteAllCookies();
			  }
			}
	}


