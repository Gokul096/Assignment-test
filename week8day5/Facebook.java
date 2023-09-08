package week8day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Facebook {
	public static void main(String[] args) {
	//launch chrome browser
	ChromeDriver driver = new ChromeDriver();
	// load the url
	driver.get("https://www.facebook.com/");
	//maximize the browser
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gokul");
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gokulmuruganantham");
	
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8870590769");
	
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("@Harish03");

	WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select Dropdown=new Select(findElement);
    //visibleText
    Dropdown.selectByVisibleText("20");	    
    //Date of year
    WebElement findElement2 = driver.findElement(By.xpath("//select[@id='year']"));
    //Date of year
    Select Dateofyear=new Select(findElement2);
    //selectValue
    Dateofyear.selectByValue("2002");
     //radio Button
    driver.findElement(By.xpath("//label[text()='Male']")).click();
    System.out.println("Title of page: " + driver.getTitle());
    
    driver.close();
	
}

}

