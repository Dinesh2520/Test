package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@ReRun\\failed.txt",glue="org.step",
dryRun= false,plugin ="C:\\Users\\suriya\\eclipse-workspace\\RedBusCucumber\\ReRun\\failed.txt")

public class ReRunner {

}
