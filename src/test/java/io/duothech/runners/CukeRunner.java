package io.duothech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"rerun:target/rerun.txt",
				"pretty",
		"html:target/built-inhtml-report",
		"json:target/Cucumber.json"
		},
		
		tags = {"@wip"},
		features = "src/test/resources/io/duotech/features"
		,glue = "io/duotech/step_definition"
		,strict=true
//		,dryRun = true
		,monochrome = true
		,stepNotifications = true
		
		)
public class CukeRunner {

}
