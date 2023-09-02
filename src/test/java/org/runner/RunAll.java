package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Featurefiles",glue="org.step",
dryRun= false,tags="@login",snippets = SnippetType.CAMELCASE,


plugin = {"html:C:\\Users\\suriya\\eclipse-workspace\\RedBusCucumber\\AllReports\\Html Report",
		"json:C:\\Users\\suriya\\eclipse-workspace\\RedBusCucumber\\AllReports\\Json Report\\fbfile.json",
		"junit:C:\\Users\\suriya\\eclipse-workspace\\RedBusCucumber\\AllReports\\Junit Reports\\fbfile.xml",
		"rerun:C:\\Users\\suriya\\eclipse-workspace\\RedBusCucumber\\ReRun\\failed.txt"
		
})

public class RunAll {

	@AfterClass
	public static void reportJvm() {
		JvmReport.getJvmReporting(System.getProperty("user.dir")+"\\\\AllReports\\\\Json Report\\\\fbfile.json");
	}
}
