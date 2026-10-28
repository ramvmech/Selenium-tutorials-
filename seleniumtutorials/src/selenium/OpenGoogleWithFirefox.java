package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\java files\\geckodriver-v0.37.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Agni");
        
        //driver.quit();
		
	}

}
