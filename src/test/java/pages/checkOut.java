package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOut {
	WebDriver driver;
	public checkOut(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="nav-cart")
	private WebElement basketIcon;
	public void clickCheckOut() throws Throwable{
		basketIcon.click();
	}
	
	@FindBy(xpath=".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
	private WebElement orderList;
	public String getOrderList() throws Throwable{
		return orderList.getText();
	}
}
