package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginpage1 {
	@FindBy(xpath = "//input[@id='email']")private WebElement UN;
	
	@FindBy(xpath = "//input[@id='pass']")private WebElement PWD;
	@FindBy(xpath = "//button[text()='Log in']")private WebElement click;
	public facebookloginpage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void inpfacebookloginpage1Username(String user) {
		UN.sendKeys(user);
	}
	public void inpfacebookloginpage1pass(String pass) {
		PWD.sendKeys(pass);
	}
	public void clickfacebookloginpage1logingbtn() {
		click.click();
	}
}
 