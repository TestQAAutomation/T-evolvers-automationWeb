package co.com.tevolvers.test.models;
import com.fasterxml.jackson.annotation.*;

public class PriceItems {

    private int totalPriceItems;
    private int totalItems;

    @JsonProperty("TotalPriceItems")
    public int getTotalPriceItems() { return totalPriceItems; }
    @JsonProperty("TotalPriceItems")
    public void setTotalPriceItems(int value) { this.totalPriceItems = value; }

    @JsonProperty("TotalItems")
    public int getTotalItems() { return totalItems; }
    @JsonProperty("TotalItems")
    public void setTotalItems(int value) { this.totalItems = value; }
}