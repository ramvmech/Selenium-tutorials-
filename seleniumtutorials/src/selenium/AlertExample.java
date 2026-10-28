package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        WebElement AlertBox = driver.findElement(By.id("j_idt88:j_idt91"));
        AlertBox.click();
        Alert alert = driver.switchTo().alert();
      
        alert.accept();
        WebElement AlertcancelBox = driver.findElement(By.id("j_idt88:j_idt93"));
        AlertcancelBox.click();
        Alert cancelalert =  driver.switchTo().alert();
        cancelalert.dismiss();
        WebElement PromptAlert = driver.findElement(By.id("j_idt88:j_idt104"));
        PromptAlert.click();
        Alert promptalert = driver.switchTo().alert();
        promptalert.sendKeys("Duck");
        promptalert.accept();
        
        
	}

}
