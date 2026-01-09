package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void actual() 
  {
	  org.testng.Reporter.log("actual testscript",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  org.testng.Reporter.log("before method",true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  org.testng.Reporter.log("after method",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  org.testng.Reporter.log("before cls",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  org.testng.Reporter.log("after cls",true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  org.testng.Reporter.log("before test",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  org.testng.Reporter.log("after test",true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  org.testng.Reporter.log("before suite",true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  org.testng.Reporter.log("after suite",true);
  }

}
