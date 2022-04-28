import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

class DataDrivenSteps {
	@Given("user needs to login")
	public void user_needs_to_login() {
	}

	@When("user adds username from {int}")
	public void user_adds_credentials(int rowNum) {
		
		
		def name = findTestData('Data Files/Data4').getValue('uname', rowNum)
		
		println ('Data here is '+name)
		
	}

	@When("click on the login")
	public void click_on_the_login() {
	}

	@Then("user is logged in")
	public void user_is_logged_in() {
	}
}