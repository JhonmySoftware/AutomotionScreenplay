package co.com.choucair.certification.screenplay.runners;


import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , snippets = SnippetType.CAMELCASE
        , tags = "@HistoriaDeusuario"
        , glue = "co.com.choucair.certification.screenplay.definition"

)

public class RunnerTags {

}