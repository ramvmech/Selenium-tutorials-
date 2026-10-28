package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenGoogle {
    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
//        System.out.println(driver.getTitle());
     // Wait up to 15 seconds
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(15));
//        ExpectedConditions.elementToBeClickable(
//                By.xpath("//button[.//div[normalize-space()='Alle akzeptieren'] or normalize-space()='Alle akzeptieren']")
//            );
//        /html/body/div[3]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div
      //*[@id="L2AGLb"]/div
        try {
            // Locate and click the Accept all button
            WebElement acceptAll =wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[.//div[normalize-space()='Alle akzeptieren'] or normalize-space()='Alle akzeptieren']")
                )
            );
            acceptAll.click();

            System.out.println("Accept all clicked successfully.");

        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println(
                "Accept all popup was not displayed or button was not found."
            );
        };
        
        // Enter text in Google's search box
        driver.findElement(By.name("q")).sendKeys("Agni"+ Keys.ENTER);
        
        

        // Close the browser when finished
        // driver.quit();
    }
}
