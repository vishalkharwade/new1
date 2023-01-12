package libraryfile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public void initiaization() throws IOException {
		driver=new ChromeDriver();	
		driver.get(UtilityClass.getvishalFileData("URL"));
	
	}

}
