package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class mainPage {
	WebDriver driver;
	public mainPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void gotoURL(){
		driver.get("http://www.amazon.co.uk");
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	public void searchItem(String itemName){
		searchBox.sendKeys(itemName);
	}
		
	
	public void selectFilter(String filterName) throws InterruptedException {
		
		Select departments = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
		departments.selectByVisibleText("Books");
	}
	
	@FindBy (xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")
	private WebElement searchButton;
	public void clickSearchButton(){
		searchButton.click();
	}
}
