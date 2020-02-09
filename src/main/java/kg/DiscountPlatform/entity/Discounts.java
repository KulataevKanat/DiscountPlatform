package kg.DiscountPlatform.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "discounts")
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;

    @Column(name = "discount_percent", columnDefinition = "varchar(10)")
    private String percent;

    @Column(name = "discount_price", columnDefinition = "varchar")
    private String discountPrice;

    @Column(name = "final_date", columnDefinition = "timestamp")
    private LocalDate finalDate;

    public Discounts() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }


}
