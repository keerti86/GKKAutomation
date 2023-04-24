package com.ng;

import org.testng.annotations.Test;

public class FruitsDependsTest {
	@Test(priority=4)
	public void mango()
	{
		System.out.println("Mango");
	}
	@Test(dependsOnMethods= {"grapes"})
	public void banana()
	{
		System.out.println("Banana");
	}
	@Test
	public void grapes()
	{
		System.out.println("Grapes");
	}
	@Test(dependsOnMethods={"mango"})
	public void apple()
	{
		System.out.println("Apple");
	}

}
