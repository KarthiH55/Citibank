package Loans;

import org.testng.annotations.Test;

public class HomeLoan {
@Test
public void ConstructionHome()
{
	System.out.println("Loan1");
}
@Test(priority=1, dependsOnMethods = "ConstructionHome")
public void LeaseHome()
{
	System.out.println("Loan2");
}
@Test(priority=2, dependsOnMethods = {"ConstructionHome","LeaseHome"})
public void RentHome()
{
	System.out.println("Loan3");
}
}
