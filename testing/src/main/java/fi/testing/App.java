package fi.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://artoftesting.com/samplesiteforselenium");
       
       driver.manage().window().maximize();
       Thread.sleep(3000);
       
       driver.quit();
    }
}
