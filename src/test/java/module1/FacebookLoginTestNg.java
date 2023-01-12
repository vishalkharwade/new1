package module1;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Module.facebookloginpage1;
import libraryfile.BaseClass;
import libraryfile.UtilityClass;

public class FacebookLoginTestNg extends BaseClass{
	
	
	facebookloginpage1 log1;
	@BeforeClass
	public void openBrowser() throws IOException {
		initiaization();
		log1=new facebookloginpage1(driver);
		
	}
	@BeforeMethod
	public void logintoApp() throws IOException {
		log1.inpfacebookloginpage1Username(UtilityClass.getvishalFileData("user"));
	log1.inpfacebookloginpage1pass(UtilityClass.getvishalFileData("pass"));
	log1.clickfacebookloginpage1logingbtn();
	}
	@Test
	public void vaarifyuser() {
		
		
	}


		
	}
