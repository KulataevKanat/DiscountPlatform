package kg.DiscountPlatform.dto.stocks;

import kg.DiscountPlatform.entity.Stocks;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class StocksDto {
    private Long id;
    private String name;
    private String description;
    private LocalDate finalDate;

    public StocksDto(Stocks stocks) {
        this.id = stocks.getId();
        this.name = stocks.getName();
        this.description = stocks.getDescription();
        this.finalDate = stocks.getFinalDate();
    }

    public static List<StocksDto> toList(List<Stocks> stocks) {
        List<StocksDto> result = new LinkedList<>();
        stocks.forEach(element -> {
            result.add(new StocksDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

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
