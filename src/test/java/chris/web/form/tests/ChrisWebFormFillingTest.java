package chris.web.form.tests;

import org.testng.annotations.Test;

import chris.web.form.base.BaseTest;
import chris.web.form.data.TestData;
import chris.web.form.pages.EJI;
import chris.web.form.pages.GDA;
import chris.web.form.pages.PPL;
import chris.web.form.pages.PlayrightBe;
import chris.web.form.pages.SAMI;
import chris.web.form.pages.SENA;


public class ChrisWebFormFillingTest extends BaseTest{


	PlayrightBe palyrightBe;
	EJI eji;
	SENA sena;
	GDA gda;
	SAMI sami;
	PPL ppl;
	

	
	@Test(priority=1)
	public void palyrightFormFilling() {
		palyrightBe=new PlayrightBe(driver);
		driver.switchTo().window(playRightBe);
		palyrightBe.launchURL(TestData.email,TestData.firstName, TestData.lastName, TestData.aliases, TestData.bands, 
				TestData.dob, TestData.placeOfBirth, TestData.COB, TestData.nationality, TestData.address1,	TestData.CSZC, TestData.Instruments, 
				TestData.fullName, TestData.zipCode, TestData.city, TestData.COR, TestData.taxID, TestData.todayDate, TestData.passportNumber, TestData.gender);
	}
	
	
	@Test(priority=2)
	public void ejiFormFillingTest() {
		
		eji=new EJI(driver);
		driver.switchTo().window(eJI);
		eji.ejiLaunch(TestData.email,TestData.firstName, TestData.lastName, TestData.aliases, TestData.bands, 
				TestData.dob, TestData.placeOfBirth, TestData.COB, TestData.nationality, TestData.address1,	TestData.CSZC, TestData.Instruments, 
				TestData.fullName, TestData.zipCode, TestData.city, TestData.COR, TestData.taxID, TestData.todayDate, TestData.passportNumber, TestData.gender);
	}
	
	@Test(priority=3)
	public void senaFormmFillingTest() {
		
		
		sena = new SENA(driver);
		driver.switchTo().window(sENA);
		sena.senaLaunch(TestData.email,TestData.firstName, TestData.lastName, TestData.aliases, TestData.bands, 
				TestData.dob, TestData.placeOfBirth, TestData.COB, TestData.nationality, TestData.address1,	TestData.CSZC, TestData.Instruments, 
				TestData.fullName, TestData.zipCode, TestData.city, TestData.COR, TestData.taxID, TestData.todayDate, TestData.passportNumber, TestData.gender);
	}
	
	
	@Test(priority=4)
	public void gdaFormFillingTest() {
		
		gda = new GDA(driver);
		driver.switchTo().window(gDA);
		gda.gdaLaunch(TestData.email,TestData.firstName, TestData.lastName, TestData.aliases, TestData.bands, 
				TestData.dob, TestData.placeOfBirth, TestData.COB, TestData.nationality, TestData.address1,	TestData.CSZC, TestData.Instruments, 
				TestData.fullName, TestData.zipCode, TestData.city, TestData.COR, TestData.taxID, TestData.todayDate, TestData.passportNumber, TestData.gender);
		
	}
	
	
	@Test(priority=5)
	public void samiFormFillingTest() {
		
		sami = new SAMI(driver);
		driver.switchTo().window(sAMI);
		sami.samiLaunch(TestData.email,TestData.firstName, TestData.lastName, TestData.aliases, TestData.bands, 
				TestData.dob, TestData.placeOfBirth, TestData.COB, TestData.nationality, TestData.address1,	TestData.CSZC, TestData.Instruments, 
				TestData.fullName, TestData.zipCode, TestData.city, TestData.COR, TestData.taxID, TestData.todayDate, TestData.passportNumber, TestData.gender);
		
	}
	
	
	
	@Test(priority=6,enabled=true)
	public void pplFormFillingTest() {
		
		ppl = new PPL(driver);
		driver.switchTo().window(pPL);
		ppl.pplLaunch(TestData.email,TestData.firstName, TestData.lastName, TestData.aliases, TestData.bands, 
				TestData.dob, TestData.placeOfBirth, TestData.COB, TestData.nationality, TestData.address1,	TestData.CSZC, TestData.Instruments, 
				TestData.fullName, TestData.zipCode, TestData.city, TestData.COR, TestData.taxID, TestData.todayDate, TestData.passportNumber, TestData.gender);
	}
	
	
	
}
