package co.com.tevolvers.test.tasks;

import co.com.tevolvers.test.interactions.Click;
import co.com.tevolvers.test.interactions.WaitElement;
import co.com.tevolvers.test.models.PriceItems;
import co.com.tevolvers.test.userinterfaces.SelectItems;
import co.com.tevolvers.test.utils.Price;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Compare implements Task {

    @Shared
    PriceItems priceItems;

    private WebDriver webDriver;
    public Compare(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.visible(SelectItems.SHOPPING_CAR));
        actor.attemptsTo(Click.on(SelectItems.SHOPPING_CAR));
        Integer totalChromeBook = Integer.parseInt(Price.priceItems(webDriver.findElement(By.xpath("//*[@id=\"shoppingCart\"]/table/tbody/tr[1]/td[6]/p")).getText()));
        Integer totalElitePad = Integer.parseInt(Price.priceItems(webDriver.findElement(By.xpath("//*[@id=\"shoppingCart\"]/table/tbody/tr[2]/td[6]/p")).getText()));
        Integer totalPriceItems = totalChromeBook + totalElitePad;
        priceItems.setTotalItems(totalPriceItems);
        Integer totalItems = Integer.parseInt(Price.priceItems(webDriver.findElement(By.xpath("//*[@id=\"shoppingCart\"]/table/tfoot/tr[1]/td[2]/span[2]")).getText()));
        priceItems.setTotalItems(totalItems);
    }
    public static Compare price(WebDriver webDriver){
        return Tasks.instrumented(Compare.class, webDriver);
    }
}
