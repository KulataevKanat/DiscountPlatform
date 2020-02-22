package kg.DiscountPlatform.dto.subCategories;

import kg.DiscountPlatform.dto.networkCategories.NetworkCategoriesFilter;
import kg.DiscountPlatform.entity.SubCategories;

import java.util.LinkedList;
import java.util.List;

public class SubCategoriesDto {
    private Long id;
    private String name;
    private NetworkCategoriesFilter networkCategories;

    public SubCategoriesDto(SubCategories subCategories) {
        this.id = subCategories.getId();
        this.name = subCategories.getName();
        this.networkCategories = new NetworkCategoriesFilter(subCategories.getNetworkCategories());
    }

    public static List<SubCategoriesDto> toList(List<SubCategories> subCategories) {
        List<SubCategoriesDto> result = new LinkedList<>();
        subCategories.forEach(element -> {
            result.add(new SubCategoriesDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public NetworkCategoriesFilter getNetworkCategories() {
        return networkCategories;
    }
}
