package kg.DiscountPlatform.dto.categories;

import kg.DiscountPlatform.entity.Categories;

public class CategoriesFilter {
    private Long id;
    private String name;
    private Long mainCategoriesId;

    public CategoriesFilter(Categories categories) {
        this.id = categories.getId();
        this.name = categories.getName();
        this.mainCategoriesId = categories.getMainCategories().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getMainCategoriesId() {
        return mainCategoriesId;
    }
}
