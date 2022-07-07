package stepDefinition;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageModule {
	
		
	@Then("Navigate to the Stock Items page and Validate the page")
	public void Navigate_to_StockItems_Page() {
	  BaseMethods.AccessToStockItemsPage();
	}
	
	@Then("Navigate to the Customers Items page and Validate the page")
	public void Navigate_to_Customers_Page() {
	  BaseMethods.AccessToCustomersPage();
	}
	
}
