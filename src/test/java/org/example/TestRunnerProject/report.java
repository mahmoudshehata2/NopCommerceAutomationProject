package org.example.TestRunnerProject;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
           features = "src/main/resources/ProjectFeatures",
           glue = "org.example.StepDefinitions",
           tags ="@SmokeTest",

                plugin = { "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"}

        )


public class report extends AbstractTestNGCucumberTests {

}
