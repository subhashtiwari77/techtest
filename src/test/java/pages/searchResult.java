package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class searchResult {
	WebDriver driver;
	public searchResult(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="The 7 Habits of Highly Effective People")
	private WebElement bookLink;
	public void clickBookLink() throws Throwable{
		bookLink.click();
	}
	
	@FindBy(id="add-to-cart-button")
	private WebElement addButton;
	public void clickAddButton() throws Throwable{
		addButton.click();
	}
	
	@FindBy(xpath=".//*[@id='a-popover-3']/div/div[1]/button")
	private WebElement popWindowClose;
	public void closePopWindow() throws Throwable{
		popWindowClose.click();
	}
}
