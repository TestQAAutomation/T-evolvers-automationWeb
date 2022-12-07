package co.com.tevolvers.test.stepDefinitions;

import co.com.tevolvers.test.exceptions.UnexpectedPrice;
import co.com.tevolvers.test.models.PriceItems;
import co.com.tevolvers.test.questions.ResponseMessage;
import co.com.tevolvers.test.tasks.Choose;
import co.com.tevolvers.test.tasks.Compare;
import co.com.tevolvers.test.tasks.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


import static co.com.tevolvers.test.enums.Resourses.USER;
import static co.com.tevolvers.test.exceptions.UnexpectedPrice.PRICE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



public class ShoppingUserStepDefinitions {

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user = Actor.named(USER.getResourses());

    @Shared
    PriceItems priceItems;

    @Given("the user selects the option in menu popular items")
    public void theUserSelectsTheOptionInMenuPopularItems() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(Select.option(herBrowser));
    }

    @When("A user select items in the page for purchase")
    public void aUserSelectItemsInThePageForPurchase() {
        user.attemptsTo(Choose.items());
        user.attemptsTo(Compare.price(herBrowser));
    }

    @Then("user compare price of articles")
    public void userComparePriceOfArticles() {
        user.should(seeThat(ResponseMessage.is(priceItems.getTotalPriceItems()), Matchers.equalTo(priceItems.getTotalItems())).orComplainWith(UnexpectedPrice.class,PRICE));
    }
}
