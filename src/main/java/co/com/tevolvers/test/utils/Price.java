package co.com.tevolvers.test.utils;

public class Price {

    private Price(){}

    public static String priceItems(String data){
        return
        data.replace("$","").replace(",","").replace(".","");
    }
}
