package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Calculator {
	
	int a,b,result;
	
	@Given("User reads a and b values")
	public void user_reads_a_and_b_values() {
       a = 100;
       b = 40;
	}
	@When("User computes a+b")
	public void user_computes_a_b() {
       result = a+b;
	}
	
	@When("User multiplies a and b")
	public void user_multiplies_a_b() {
       result = a*b;
	}
	
	@Then("Display the Results {int}")
	public void display_the_results(int expResult) {
       System.out.println("The Result is " + result);
       Assert.assertEquals(expResult, result);
	}
	
	@Given("User reads {int} and {int} values")
	public void user_reads_and_values(int num1, int num2) {
		a = num1;
		b = num2;
	}

}
