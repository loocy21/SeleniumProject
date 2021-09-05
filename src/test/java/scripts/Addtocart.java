package scripts;

import java.io.FileNotFoundException;

import java.io.IOException;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Addtocart extends BaseClass{

	@Test
	
	public void tc1() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.SkillrarydemoApplication();
		
		utilies.switchTabs(driver);
		
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver,d.getCoursebtn());
		d.selemiumtrainingbtn();

		
		
		AddtocartPage e=new AddtocartPage(driver);
		utilies .doubleClick(driver,e.getClickaddbtn());
		e.Addtocartbutton();
		Thread.sleep(2000);
		//utilies.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(), pdata.getPropertyFile("skillrarytitle"));
	
		Reporter.log(driver.getTitle(),true);
	}
	
	

}

