package nelson.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utestPlatform.feature",
        tags = "@stories",
        glue = "nelson.choucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
