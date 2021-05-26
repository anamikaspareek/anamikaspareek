package practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class noName {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "../practice/drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.fatcow.com/");
			Thread.sleep(10000);
			Actions a=new Actions(driver);
			WebElement target = driver.findElement(By.xpath("//a[@class='mainnav' and text()='Around the Farm']"));
			a.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='About FatCow']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.visibilityOf(target));
		WebElement target1 = driver.findElement(By.xpath("//b[text()='Hosting Solutions']"));
		a.contextClick(target1);
			
			driver.close();
			
			
			
			
			
			
			
			
			

}
}
