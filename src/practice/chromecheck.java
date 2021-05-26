package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class chromecheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../practice/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/flights/");
		Thread.sleep(10000);
		WebElement from = driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5' and text()='From']"));
		from.click();
		
		WebElement from2 = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		/*List<WebElement> elements = driver.findElements(By.tagName("a"));
		int size = elements.size();
		System.out.println(size);
		int enabled=0;;
		int disabled=0;
		for(int i=0;i<size;i++)
		{
			WebElement value = elements.get(i);
			String text = value.getText();
			System.out.println(text);
			if(value.isEnabled())
			{
				enabled++;
			}
			else
			{
				disabled++;
			}
			
			
		}
		System.out.println("enabled"+enabled+" "+"Disabled"+disabled);
		
		
		
		
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mi Note 5 Black 32 GB ");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		String ratings = driver.findElement(By.xpath("//div[@class='_4rR01T'  and text()='Redmi Note 5 (Black, 32 GB)']/..//span[contains(text(),'Ratings')]")).getText();
		
		System.out.println(ratings);
		driver.close();*/
		
		
		
		
		
		
		
		
		
		
/*		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		if(title.contains("Google"))
		{
			System.out.println("google page displayed");
		}
		else
		{
			System.out.println("oops");
		}
		driver1.close();
driver.navigate().to("https://www.google.com");
driver.navigate().refresh();
driver.navigate().to("https://www.facebook.com");

driver.navigate().forward();
driver.navigate().back();
Thread.sleep(1000);
driver.manage().window().maximize();
//Dimension d =new Dimension(200,200); 

//driver.close();
driver.navigate().to("https://www.google.com");
WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi' ]"));

/*element.click();
Thread.sleep(1000);
String gtitile = driver.getTitle();
System.out.println(gtitile);
if(gtitile.contains("Gmail"))
{
	System.out.println("script success");
}
else
{
	System.out.println("script fail");
	
}
element.sendKeys( "hello");
WebElement element2 = driver.findElement(By.xpath("(//input[@class='gNO89b' and @value='Google Search' ])[2]"));

element2.click();
*/
	}

}
