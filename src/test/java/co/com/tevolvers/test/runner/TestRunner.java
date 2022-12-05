package co.com.tevolvers.test.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co/com/tevolvers/test/features/",
        glue = {"co.com.tevolvers.test.stepDefinitions", "co.com.tevolvers.test.set.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@ShoppingTest"

)
public class TestRunner {
}