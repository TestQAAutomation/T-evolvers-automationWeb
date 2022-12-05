package co.com.tevolvers.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopularItems extends PageObject {

    public static final Target BUTTON_POPULAR_ITEMS = Target.the("Button popular items").located(By.xpath("//li[6]//a[@class='menu navLinks roboto-regular ng-scope']"));
}
