package co.com.tevolvers.test.models;
import com.fasterxml.jackson.annotation.*;

public class PriceItems {

    private Integer totalPriceItems;
    private Integer totalItems;

    @JsonProperty("TotalPriceItems")
    public Integer getTotalPriceItems() { return totalPriceItems; }
    @JsonProperty("TotalPriceItems")
    public void setTotalPriceItems(Integer value) { this.totalPriceItems = value; }

    @JsonProperty("TotalItems")
    public Integer getTotalItems() { return totalItems; }
    @JsonProperty("TotalItems")
    public void setTotalItems(Integer value) { this.totalItems = value; }
}