package kg.DiscountPlatform.dto.products;

public class ProductsRequest {
    private Long id;
    private String name;
    private String price;
    private String description;
    private Long subCategoriesId;
    private Long discountsId;
    private Long stocksId;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Long getSubCategoriesId() {
        return subCategoriesId;
    }

    public Long getDiscountsId() {
        return discountsId;
    }

    public Long getStocksId() {
        return stocksId;
    }
}
