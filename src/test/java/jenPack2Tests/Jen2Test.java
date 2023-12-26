package jenPack2Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Jen2Test {
//	@Parameters("Browser")
@Test 
public void m2Test() {
	String BROWSER = System.getProperty("browser");
	
	WebDriver driver;
	if(BROWSER.equals("edge")) {
		driver= new EdgeDriver();
	 	 
	}else {
		driver= new FirefoxDriver();
		
	}
	
	String URL=System.getProperty("url");
	driver.get(URL);
	System.out.println("amazon launched in chrome browser successfully");
	
}

@Test
public void selviTest() {
	System.out.println("Hi selvi");
}


}
