package com.sauce.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-html-report.html",
                "json:target/cucumber.json"


        },
        features = "src/test/resources/features",
        glue = "com/sauce/stepDefs",
        dryRun = false,
        tags = "@wip5"

)
public class CukesRunner {

}
