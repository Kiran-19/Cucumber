package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features",glue={"com.stepdefinition"},
monochrome=true,
plugin= {"html:Reports\\HTMLReports", "json:Reports\\JsonReports\\cucumber.json",
		"junit:Reports\\JunitReport\\cucumber.xml"},
dryRun=false,
strict=true

)


public class Runner {

}
