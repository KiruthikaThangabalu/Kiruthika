package SureFire;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SureFireCode {
	
	//SureFire is used to run the whole project in command prompt ,Jenkins and Eclipse
	

	@Test(groups="one")
	public void t1() throws InterruptedException { 
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Education\\Kiruthika\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 Thread.sleep(3000);
		 System.out.println(driver.getTitle());
		 driver.quit();
		 
   //1.Here create maven project
   //2.Create package and class in srx/test/java of project
   //3.Add corresponding dependancy in the pom.xml	 
   //4.Convert to testng.xml file
   //5.Right click pom.xml file and click run as and maven clean see o/p build sucess
   //6.Project right click run as maven install and get output
	//Testing	 
		 
}
	}
