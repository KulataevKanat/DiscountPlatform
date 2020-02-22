package kg.DiscountPlatform.dto.discounts;

import kg.DiscountPlatform.entity.Discounts;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DiscountsDto {
    private Long id;
    private String percent;
    private String discountPrice;
    private LocalDate finalDate;

    public DiscountsDto(Discounts discounts) {
        this.id = discounts.getId();
        this.percent = discounts.getPercent();
        this.discountPrice = discounts.getDiscountPrice();
        this.finalDate = discounts.getFinalDate();
    }

    public static List<DiscountsDto> toList(List<Discounts> discounts) {
        List<DiscountsDto> result = new LinkedList<>();
        discounts.forEach(element -> {
            result.add(new DiscountsDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

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
