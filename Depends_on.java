package testng;



public class Depends_on 
{
	@org.testng.annotations.Test
	public void createaccount()
	{
		org.testng.Reporter.log("account created",true);
	}
	@org.testng.annotations.Test(dependsOnMethods = "createaccount")
	public void editaccount()
	{
		org.testng.Reporter.log("acc edited ",true);
	}
	@org.testng.annotations.Test(dependsOnMethods = {"editaccount","createaccount"})
	public void deleteaccount()
	{
		org.testng.Reporter.log("acc deleted ",true);
	}
	

}
