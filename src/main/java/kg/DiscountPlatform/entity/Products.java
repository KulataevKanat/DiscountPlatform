package kg.DiscountPlatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(255)")
    private String name;

    @Column(name = "price", columnDefinition = "varchar(255)")
    private String price;

    @Column(name = "description", columnDefinition = "varchar(255)")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_categories_id", columnDefinition = "integer")
    private SubCategories subCategories;

    @OneToOne
    @JoinColumn(name = "discounts_id", columnDefinition = "integer")
    private Discounts discounts;

    @OneToOne
    @JoinColumn(name = "stocks_id", columnDefinition = "integer")
    private Stocks stocks;

    public Products() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubCategories getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(SubCategories subCategories) {
        this.subCategories = subCategories;
    }

    public Discounts getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Discounts discounts) {
        this.discounts = discounts;
    }

    public Stocks getStocks() {
        return stocks;
    }

    public void setStocks(Stocks stocks) {
        this.stocks = stocks;
    }
}
