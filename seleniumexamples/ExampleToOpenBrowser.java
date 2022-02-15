package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleToOpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver", "D:\\Softwares\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL=("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to(URL);
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		String Actualresult=driver.getTitle();
		System.out.println("title of the page is:" +Actualresult);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();	   
		driver.close();
		
	}

}
