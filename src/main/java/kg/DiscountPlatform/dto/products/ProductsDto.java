package kg.DiscountPlatform.dto.products;

import kg.DiscountPlatform.dto.discounts.DiscountsDto;
import kg.DiscountPlatform.dto.stocks.StocksDto;
import kg.DiscountPlatform.dto.subCategories.SubCategoriesFilter;
import kg.DiscountPlatform.entity.Products;

import java.util.LinkedList;
import java.util.List;

public class ProductsDto {
    private Long id;
    private String name;
    private String price;
    private String description;
    private SubCategoriesFilter subCategories;
    private DiscountsDto discounts;
    private StocksDto stocks;

    public ProductsDto(Products products) {
        this.id = products.getId();
        this.name = products.getName();
        this.price = products.getPrice();
        this.description = products.getDescription();
        this.subCategories = new SubCategoriesFilter(products.getSubCategories());
        this.discounts = new DiscountsDto(products.getDiscounts());
        this.stocks = new StocksDto(products.getStocks());
    }

    public static List<ProductsDto> toList(List<Products> products) {
        List<ProductsDto> result = new LinkedList<>();
        products.forEach(element -> {
            result.add(new ProductsDto(element));
        });
        return result;
    }

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

    public SubCategoriesFilter getSubCategories() {
        return subCategories;
    }

    public DiscountsDto getDiscounts() {
        return discounts;
    }

    public StocksDto getStocks() {
        return stocks;
    }
}
