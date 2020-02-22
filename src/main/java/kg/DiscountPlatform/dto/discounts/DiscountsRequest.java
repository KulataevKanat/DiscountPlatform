package kg.DiscountPlatform.dto.discounts;

import java.time.LocalDate;

public class DiscountsRequest {
    private String percent;
    private String discountPrice;
    private LocalDate finalDate;

    public String getPercent() {
        return percent;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }
}
