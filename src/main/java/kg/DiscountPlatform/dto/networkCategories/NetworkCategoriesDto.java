package kg.DiscountPlatform.dto.networkCategories;

import kg.DiscountPlatform.dto.categories.CategoriesFilter;
import kg.DiscountPlatform.entity.NetworkCategories;

import java.util.LinkedList;
import java.util.List;

public class NetworkCategoriesDto {
    private Long id;
    private String name;
    private CategoriesFilter categories;

    public NetworkCategoriesDto(NetworkCategories networkCategories) {
        this.id = networkCategories.getId();
        this.name = networkCategories.getName();
        this.categories = new CategoriesFilter(networkCategories.getCategories());
    }

    public static List<NetworkCategoriesDto> toList(List<NetworkCategories> networkCategories) {
        List<NetworkCategoriesDto> result = new LinkedList<>();
        networkCategories.forEach(element -> {
            result.add(new NetworkCategoriesDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CategoriesFilter getCategories() {
        return categories;
    }
}
