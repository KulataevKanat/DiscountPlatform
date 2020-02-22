package kg.DiscountPlatform.dto.subCategories;

import kg.DiscountPlatform.entity.SubCategories;

public class SubCategoriesFilter {
    private Long id;
    private String name;
    private Long networkCategoriesId;

    public SubCategoriesFilter(SubCategories subCategories) {
        this.id = subCategories.getId();
        this.name = subCategories.getName();
        this.networkCategoriesId = subCategories.getNetworkCategories().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getNetworkCategoriesId() {
        return networkCategoriesId;
    }
}
