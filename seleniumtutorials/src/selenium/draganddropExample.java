package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml");
        WebElement From = driver.findElement(By.id("form:drag_content"));
        WebElement To = driver.findElement(By.id("form:drop_header"));
        Actions actions = new  Actions (driver);
        actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
        WebElement From1 = driver.findElement(By.xpath("//*[@id=\"form:j_idt94:j_idt95\"]"));
        WebElement To1 = driver.findElement(By.xpath("//*[@id=\"form:j_idt94:j_idt97\"]"));
        actions.clickAndHold(From1).moveToElement(To1).release(To1).build().perform();
        
        
	}

}
