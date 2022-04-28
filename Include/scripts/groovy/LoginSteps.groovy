import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class LoginSteps {
	
	def username
	def password

	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://trytestingthis.netlify.app/')
	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(username, password) {
		WebUI.setText(findTestObject('Object Repository/WEB/Page_Try Testing This/input_Username_uname'), username)
		WebUI.setText(findTestObject('Object Repository/WEB/Page_Try Testing This/input_Password_pwd'), password)
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		WebUI.click(findTestObject('Object Repository/WEB/Page_Try Testing This/input'))
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		WebUI.verifyElementText(findTestObject('Object Repository/WEB/Page_Login Success/h2_Login Successful )'), 'Login Successful :)')
		WebUI.closeBrowser()
	}
}
