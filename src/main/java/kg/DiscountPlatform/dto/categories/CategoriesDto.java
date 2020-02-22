package kg.DiscountPlatform.dto.categories;

import kg.DiscountPlatform.dto.mainCategories.MainCategoriesDto;
import kg.DiscountPlatform.entity.Categories;

import java.util.LinkedList;
import java.util.List;

public class CategoriesDto {
    private Long id;
    private String name;
    private MainCategoriesDto mainCategories;

    public CategoriesDto(Categories categories) {
        this.id = categories.getId();
        this.name = categories.getName();
        this.mainCategories = new MainCategoriesDto(categories.getMainCategories());
    }

    public static List<CategoriesDto> toList(List<Categories> categories) {
        List<CategoriesDto> result = new LinkedList<>();
        categories.forEach(element -> {
            result.add(new CategoriesDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MainCategoriesDto getMainCategories() {
        return mainCategories;
    }
}
