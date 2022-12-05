package co.com.tevolvers.test.tasks;

import co.com.tevolvers.test.interactions.WaitElement;
import co.com.tevolvers.test.userinterfaces.PopularItems;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class Select implements Task {

    private WebDriver webDriver;

    public Select(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.visible(PopularItems.BUTTON_POPULAR_ITEMS));
        webDriver.findElement(By.xpath("//li[6]//a[@class='menu navLinks roboto-regular ng-scope']")).click();
    }
    public static Select option(WebDriver webDriver){return Tasks.instrumented(Select.class, webDriver);
    }
}
