package selenium;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class TableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/table.xhtml");
        
        WebElement Table = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_head\"]"));
        List<WebElement> CountColumns = driver.findElements(By.xpath("//*[@id='form:j_idt89_head']/tr"));
        int Colsize = CountColumns.size();
        System.out.println("Total columns in the first table: "+ Colsize);
        for (WebElement Col : CountColumns) {
        	System.out.println(Col.getText());
			
		}
        List<WebElement> CountRows = driver.findElements(By.tagName("tr"));
        int Rowsize = CountRows.size();
        System.out.println("Total columns in the first table: "+ Rowsize);
        
        String name = "Amy Elsner";
        String xpath = "//tr[td[normalize-space(.)='"
                + name + "']]/td[2]";
        
        try {
        	WebElement country = driver.findElement(
        	        By.xpath("//tr[td[normalize-space(.)='Amy Elsner']]/td[2]")
            );

            System.out.println("Name: " + name);
            System.out.println("Country: " + country.getText());

        } catch (Exception e) {
            System.out.println("Name not found: " + name);
        }
	}

}
