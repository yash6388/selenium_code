package fi.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sele_test {
	WebDriver driver;
	@BeforeTest
	public void before() {
	 driver = new ChromeDriver();
	
    
    driver.get("https://artoftesting.com/samplesiteforselenium");
	}
    @Test
    public void test() throws InterruptedException {
    driver.manage().window().maximize();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/p[1]/a")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Hello");
    
    Thread.sleep(3000);
    
    
    //double click
    Actions actions = new Actions(driver);
    WebElement doubleClickElement = driver.findElement(By.id("dblClkBtn"));
    actions.doubleClick(doubleClickElement).perform();
    Thread.sleep(2000);
    Alert alert = driver.switchTo().alert();
    System.out.println("Alert message: " + alert.getText());
    alert.accept();
    Thread.sleep(2000);
    
 // 2. Click the button to generate a Confirm box
    driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button")).click();
    Thread.sleep(2000);

    // Handle the confirm box
    Alert confirmBox = driver.switchTo().alert();
    System.out.println("Confirm box message: " + confirmBox.getText());
    confirmBox.accept(); // Use confirmBox.dismiss() to click "Cancel"
    Thread.sleep(2000);
    
    }
    @AfterTest
    public void after() {
    driver.quit();
    }

}
