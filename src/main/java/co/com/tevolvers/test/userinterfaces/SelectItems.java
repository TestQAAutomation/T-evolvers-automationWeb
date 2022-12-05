package co.com.tevolvers.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectItems extends PageObject{

    public static final Target DETAILS_ELITEPAD = Target.the("Button Details Elitepad").located(By.xpath("//article[@id=\"popular_items\"]//div[@class=\"grid-table center\"]//div[@name=\"popular_item_16\"]//a[@role=\"link\"]//label[@id=\"details_16\"]"));
    public static final Target ADD_TO_CAR_ELITEPAD = Target.the("Button Add To Car").located(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
    public static final Target HOME = Target.the("Button Home").located(By.xpath("/html/body/div[3]/nav/a[1]"));
    public static final Target DETAILS_ELITEBOOK = Target.the("Button Details EliteBook").located(By.xpath("//article[@id=\"popular_items\"]//div[@name=\"popular_item_10\"]//a[@role=\"link\"]//label[@id=\"details_10\"]"));
    public static final Target ADD_TO_CAR_CHROMEBOOK = Target.the("Add to car ChromeBook").located(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
    public static final Target SHOPPING_CAR = Target.the("Shopping Car").located(By.xpath("//*[@id=\"menuCart\"]"));
}
