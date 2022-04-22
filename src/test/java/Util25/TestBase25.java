package Util25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase25  {
	public static WebDriver driver; // Make it Global
	public static Properties Swag; // Properties Class // Make it Global
	
	public TestBase25() {
		
 Swag= new Properties(); 
	
	try {  // FileInputStream Class coming from java.io Package // to read & write from the file // To get the location of config.properties file
		FileInputStream fls= new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Swag\\config\\Swag.properties");
		
		Swag.load(fls); // To load the file// we have to throw an exception try and catch
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}
	
	public void initil() {   //we using this to initialize the browser
		String browserName = Swag.getProperty("Browser1");
		
		if(browserName.equals("CC")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver25\\chromedriver.exe" );//take the path from driver file & copy from //Driver// change the slash to \\
			driver = new ChromeDriver();
			driver.manage().window().maximize(); //To maximize the window
			driver.manage().timeouts().pageLoadTimeout(Util_25.page_Load_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Util_25.implicitly_Wait, TimeUnit.SECONDS);  
			System.out.println("This is Chrome Browser");
		}
		else if(browserName.equals("FF"));
		
		
		
		
	}
	public static void getURL(String URL) { // String URL - we make a parameter // 
		
		driver.get(Swag.getProperty("URL"));  // Make a Method for Launching a Browser 
		
		
		
	}
	
}


