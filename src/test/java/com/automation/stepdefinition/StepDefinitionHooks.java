package com.automation.stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDefinitionHooks {

	@Before
	public void beforeHooks(Scenario s) 
	{
        
		System.out.println("beforehooks");
		//String name=s.getName();
		System.out.println("Scenario is "+s.getName());
		
		
	}
	
	@After
	public void afterHooks(Scenario s) 
	{
		
		System.out.println("AfterHooks");
		String status=s.getStatus();
		System.out.println("Scenario status "+status);
		/*if(scenario.isFailed())
		{
			System.out.println("Failed scenario "+status);
		}*/
		
	}
	
}
