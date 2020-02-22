package kg.DiscountPlatform.dto.networkCategories;

import kg.DiscountPlatform.entity.NetworkCategories;

public class NetworkCategoriesFilter {
    private Long id;
    private String name;
    private Long categoriesId;

    public NetworkCategoriesFilter(NetworkCategories networkCategories) {
        this.id = networkCategories.getId();
        this.name = networkCategories.getName();
        this.categoriesId = networkCategories.getCategories().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCategoriesId() {
        return categoriesId;
    }
}
