package chris.web.form.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import chris.web.form.base.BasePage;

public class PPL extends BasePage{

WebDriver driver;
	
	
	
	By userName = By.xpath("//input[@placeholder='Username / Email']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginBtn = By.xpath("//button");
	
	By accounteLink = By.xpath("//a[text()='Accounts']");
	By registrationLink  = By.xpath("//span[text()='Registrations']");
	By addRegisterBtn = By.xpath("//button[text()='ADD ANOTHER REGISTRATION']");
	By registrationList= By.xpath("//ul[@class='slds-dropdown__list slds-dropdown--length-10']/li");
	
	By firstName = By.name("FirstName");
	By lastName = By.name("LastName");
	By email = By.name("PersonEmail");
	By dob = By.xpath("//div[@class='form-element uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime']/input");
	By cobDropDown=By.name("Country_of_birth__c");
	By corDropDown = By.name("address_country");
	By address = By.name("address_street");
	By city = By.name("address_city");
	By state = By.name("address_state");
	By postalCode = By.name("address_postcode");
	By taxId = By.name("WHTTaxPayerRefNo__c");
	
	
	public PPL(WebDriver driver) {
		this.driver =driver;
		
	}
	

	public void pplLaunch(String email, String firstName, String lastName, String aliasName, String Bands, String dob,
			String placeOfBirth, String COB, String nationality, String address, String CSZC, String instruments, String fullName,
			String postalCode, String city, String COR, String taxId, String todaysDate, String passportNo, String gender) {
		
		

		
		
		driver.findElement(userName).sendKeys("chris@ridentroyalties.com");
		driver.findElement(password).sendKeys("LobsterCrab22!");
		driver.findElement(loginBtn).click();
		
		driver.findElement(accounteLink).click();
		driver.findElement(registrationLink).click();
		driver.findElement(addRegisterBtn).click();
		List<WebElement> regList = driver.findElements(registrationList);
		for (WebElement ele : regList) {
			String text = ele.getText();
			//System.out.println(text);
			if(text.equals("Performer")) {
				ele.click();
				break;
			}
		}
		
		driver.findElement(this.firstName).sendKeys(firstName);
		driver.findElement(this.lastName).sendKeys(lastName);
		driver.findElement(this.email).sendKeys(email);
		driver.findElement(this.dob).sendKeys(dob);
		
		WebElement cobEle = driver.findElement(cobDropDown);
		Select cobSelect = new Select(cobEle);
		List<WebElement> cobList = cobSelect.getOptions();
		for (WebElement ele : cobList) {
			String cobText = ele.getText();
					if(cobText.equals(COB)) {
						ele.click();
						break;
					}
		}
		
		WebElement corEle = driver.findElement(corDropDown);
		Select corSelect = new Select(corEle);
		List<WebElement> corList = corSelect.getOptions();
		for (WebElement ele : corList) {
			String corText = ele.getText();
			//System.out.println(corText);
			if(corText.equals(COR)) {
				ele.click();
				break;
			}
		}
		
		driver.findElement(this.address).sendKeys(address);
		driver.findElement(this.city).sendKeys(city);
		driver.findElement(this.postalCode).sendKeys(postalCode);
		driver.findElement(this.taxId).sendKeys(taxId);
		
		
		
	}
}
