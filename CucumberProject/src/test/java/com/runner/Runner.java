package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/TagsDemo.feature",glue={"com.stepdefinition"},
monochrome=true,
plugin= {"html:Reports\\HTMLReports", "json:Reports\\JsonReports\\cucumber.json",
		"junit:Reports\\JunitReport\\cucumber.xml"},

dryRun=false,  //mapping between feature file and step file
strict=true, // it will check if any step is not defined in step def file
tags= {"@FunctionalTest and @SmokeTest"}
)


public class Runner {

}
