import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_1
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jqueryui.com");
		
		//demos
		driver.findElement(By.linkText("Demos")).click();
		
		//draggable
		driver.findElement(By.xpath("(//a[text()='Draggable'])[1]")).click();
		driver.navigate().back();
		
		//droppable
		driver.findElement(By.linkText("Droppable")).click();
		driver.navigate().back();
		
		//resizable
		driver.findElement(By.xpath("(//a[text()='Resizable'])[1]")).click();
		driver.navigate().back();
		
		//selectble
		driver.findElement(By.linkText("Selectable")).click();
		driver.navigate().back();
		
		//sortable
		driver.findElement(By.linkText("Sortable")).click();
		driver.navigate().back();
		
		

	}

}
