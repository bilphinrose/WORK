package alert_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		driver.findElement(By.name("B1")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
