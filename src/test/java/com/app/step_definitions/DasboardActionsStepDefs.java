package com.app.step_definitions;

import com.app.pages.SuiteCRMDasboardPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DasboardActionsStepDefs {
	
	SuiteCRMDasboardPage dasboardPage = new SuiteCRMDasboardPage();
	

	@When("I post {string}")
	public void i_post(String note) {
		
		
		dasboardPage.postNote(note);
		

	}

	@Then("Post should be displayed")
	public void post_should_be_displayed() {

		
	}
	
	@Then("logout from application")
	public void logout_from_application() {
	    dasboardPage.logout();
	}

}
