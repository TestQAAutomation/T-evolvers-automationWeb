package co.com.tevolvers.test.tasks;

import co.com.tevolvers.test.interactions.Click;
import co.com.tevolvers.test.interactions.WaitElement;
import co.com.tevolvers.test.userinterfaces.PopularItems;
import co.com.tevolvers.test.userinterfaces.SelectItems;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Choose implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.visible(SelectItems.DETAILS_ELITEPAD));
        actor.attemptsTo(Click.on(SelectItems.DETAILS_ELITEPAD));
        actor.attemptsTo(WaitElement.visible(SelectItems.ADD_TO_CAR_ELITEPAD));
        actor.attemptsTo(Click.on(SelectItems.ADD_TO_CAR_ELITEPAD));
        actor.attemptsTo(Click.on(SelectItems.HOME));
        actor.attemptsTo(Click.on(PopularItems.BUTTON_POPULAR_ITEMS));
        actor.attemptsTo(WaitElement.visible(SelectItems.DETAILS_ELITEBOOK));
        actor.attemptsTo(Click.on(SelectItems.DETAILS_ELITEBOOK));
        actor.attemptsTo(Click.on(SelectItems.ADD_TO_CAR_CHROMEBOOK));
    }
    public static Choose items(){return Tasks.instrumented(Choose.class);
    }
}
