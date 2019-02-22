package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features= {"features/restaurantsignin.feature"},
		glue= {"com.stepdef"}
		)
		public class Runner extends  AbstractTestNGCucumberTests{

}
