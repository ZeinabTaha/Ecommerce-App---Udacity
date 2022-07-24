package io.github.ZeinabTaha.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/features",
                glue = "io.github.ZeinabTaha.stepDefs",
                plugin = {          "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"},
                tags = "@test"
        )



public class runners extends AbstractTestNGCucumberTests {
}
