import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		
		driver.findElement(By.id("login_field")).sendKeys("shivu10aug96@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Github@96");
		
		driver.findElement(By.name("commit")).click();
		
		driver.findElement(By.xpath("(//span[text()='Shivukumar96'])[1]")).click();
		
		driver.findElement(By.linkText("Upload files")).click();
		
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[3]/div/div[2]/form[2]/file-attachment/p/input"));
		upload.sendKeys("C:\\Users\\u721200\\eclipse-workspace\\Assignment\\src\\Assign_2.java");
		
        driver.findElement(By.id("commit-description-textarea")).sendKeys("assignment program   12345");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-edit-text='Commit changes']")).click();
		
		

	}

}
