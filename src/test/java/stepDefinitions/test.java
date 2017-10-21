package stepDefinitions;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.checkOut;
import pages.mainPage;
import pages.searchResult;

public class test {
	WebDriver driver;
	mainPage main;
	searchResult search;
	checkOut checkout;
		
	@Given("^navigate to Amazon UK website$") 
	public void navigate_to_Amazon_UK_website() throws Throwable{
		System.setProperty("webdriver.chrome.driver","src\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		main = new mainPage(driver);
		
		main.gotoURL();
	}
	
	@When("^change the search filter to books and search for the book$")
	public void change_the_search_filter_to_books_and_search_for_the_book() throws Throwable{
		//main = new mainPage(driver);
		main.selectFilter("Books");
		main.searchItem("7 habits of highly effective people");
		main.clickSearchButton();
	}
	
	@When("^add the book to the basket$")
	public void add_the_book_to_the_basket() throws Throwable{
		search = new searchResult(driver);
		search.clickBookLink();
		Thread.sleep(2000);
		search.closePopWindow();
		Thread.sleep(5000);
		search.clickAddButton();
		
		
	}

	@Then("^the searched book is added to the checkout$")
	public void the_searched_book_is_added_to_the_checkout() throws Throwable {
		checkout = new checkOut(driver);
		checkout.clickCheckOut();
        assertTrue(checkout.getOrderList().equals("The 7 Habits of Highly Effective People"));
		
	}
	
	@After()
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
}
