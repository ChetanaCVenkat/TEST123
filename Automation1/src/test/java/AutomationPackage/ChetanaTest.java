package AutomationPackage;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ChetanaTest {
	
static Logger log =LogManager.getLogger(ChetanaTest.class);

	@Test
	public static void login()
	{
	
	System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://demo.guru99.com/test/newtours/");
	driver.getTitle();
	System.out.print("che");
log.info("chetanaaasssaaaaaa");
log.error("error");
	driver.close();
	
	}

}
