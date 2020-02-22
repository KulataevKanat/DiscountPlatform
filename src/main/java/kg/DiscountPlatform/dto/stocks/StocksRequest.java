package kg.DiscountPlatform.dto.stocks;

import java.time.LocalDate;

public class StocksRequest {
    private String name;
    private String description;
    private LocalDate finalDate;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }
}
