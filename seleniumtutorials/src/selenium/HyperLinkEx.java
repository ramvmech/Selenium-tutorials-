package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/link.xhtml");
        WebElement HomePage = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a"));
        HomePage.click();
        driver.navigate().back();
        WebElement WheretoGo = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[2]/div/div/a"));
        String where = WheretoGo.getAttribute("href");
        System.out.println("This Link is Going to : "+ where);
        WebElement brokenLink = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[3]/div/div/a"));
        brokenLink.click();
        String title = driver.getTitle();
        if (title.contains("404")){
        	System.out.println("The Link is Broken ");
        }
        driver.navigate().back();
        WebElement HomePageAgain = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a"));
        HomePageAgain.click();
        driver.navigate().back();

	    List<WebElement> totalLinks = driver.findElements(By.xpath("//*[@id='j_idt87']//a[@href]"));
	    int hrefCount = 0;
	    for (WebElement link : totalLinks ) {
	    	if (link.getAttribute("href")!= null) {
	    		hrefCount++;
	    	}
	    }
	    System.out.println("Tot no of Links : "+ hrefCount);
	    
		  

        

	}

}
