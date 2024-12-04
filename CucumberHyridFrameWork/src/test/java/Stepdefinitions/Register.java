package Stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {
	

@Given("user open register page")
public void user_open_register_page() {
	
	
}

@When("User enters the details into below fields")
public void user_enters_the_details_into_below_fields(io.cucumber.datatable.DataTable dataTable) {
	
}

@And("User select privacy policy")
public void user_select_privacy_policy() {
}

@And("User clicks on continue button")
public void user_clicks_on_continue_button() {
}

@Then("User account shold get created successful")
public void user_account_shold_get_created_successful() {
}

@Given("User open register account page")
public void user_open_register_account_page() {
}

@When("User enters the details into below fields")
public void user_enters_the_details_into_below_fields_(DataTable dataTable) {}


@When("User select Yes for Newsletter")
public void user_select_yes_for_newsletter() {
}

@Then("User account should get your account has been created successful")
public void user_account_should_get_your_account_has_been_created_successful() {
}

@Then("User account should get warning message")
public void user_account_should_get_warning_message() {
}

@Then("User dont enter any details fields")
public void user_dont_enter_any_details_fields() {
}

@Then("click on Continue button")
public void click_on_continue_button() {
}

@Then("User should get proper warning meaasge for every mandatory field")
public void user_should_get_proper_warning_meaasge_for_every_mandatory_field() {
}


}
