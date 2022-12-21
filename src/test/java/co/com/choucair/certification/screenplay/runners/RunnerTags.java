package co.com.choucair.certification.screenplay.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"co.com.choucair.certification.screenplay.definition"}
)

public class RunnerTags {

}