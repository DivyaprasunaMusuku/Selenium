package seleniumexamples;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","D:\\Softwares\\selenium\\chromedriver.exe");
     WebDriver driver=(WebDriver) new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
     driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
     //driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")).click();
     WebElement UserRole=driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']"));
     Select Role=new Select(UserRole);
     Role.selectByIndex(2);
    // List<WebElement> allRoles=Role.getOptions();
     //Role.selectBy("Admin");
     //System.out.println("User Role is" +allRoles.size());
     
     
  
     
     
     
	}
}
