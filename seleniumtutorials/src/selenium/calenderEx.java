package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calenderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/calendar.xhtml");
        String date = "2026-10-15" ;
        WebElement Datacell = driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[3]/td[5]/div"));
        Datacell.click();
//        WebElement Title = driver.findElement(By.xpath("//input[@id='j_idt87:title']"));
        WebDriverWait wait =
        	    new WebDriverWait(driver, Duration.ofSeconds(10));

        	// Wait for the Title field inside the popup
        	WebElement title = wait.until(
        	    ExpectedConditions.visibilityOfElementLocated(
        	        By.xpath("//input[@id='j_idt87:title']")
        	    )
        	);
        title.sendKeys("Termine");
        WebElement from = driver.findElement(By.id("j_idt87:from_input"));
        from.clear();
        from.sendKeys("15/11/2026 10:00");
        WebElement to = driver.findElement(By.id("j_idt87:to_input"));
        to.clear();
        to.sendKeys("15/11/2026 11:00");
        WebElement Save = driver.findElement(By.xpath("//*[@id=\"j_idt87:addButton\"]"));
        Save.click();
        System.out.println("Event creation attempted");      
	}

}
