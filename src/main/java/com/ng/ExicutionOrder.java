package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExicutionOrder {

@Test
public void one()
{
	System.out.println("one");
}

public void two()
{
	System.out.println("two");
}

public void three()
{
	System.out.println("three");
}
@AfterClass
public void four()
{
	System.out.println("four");
}
@BeforeClass
public void five()
{
	System.out.println("five");
}
@AfterTest
public void six()
{
	System.out.println("six");
}
@BeforeTest
public void seven()
{
	System.out.println("seven");
}
@AfterSuite
public void eight()
{
	System.out.println("eight");
}
@BeforeSuite
public void nine()
{
	System.out.println("nine");
}

}
