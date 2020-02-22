package kg.DiscountPlatform.dto.mainCategories;

import kg.DiscountPlatform.entity.MainCategories;

import java.util.LinkedList;
import java.util.List;

public class MainCategoriesDto {
    private Long id;
    private String name;

    public MainCategoriesDto(MainCategories mainCategories) {
        this.id = mainCategories.getId();
        this.name = mainCategories.getName();
    }

    public static List<MainCategoriesDto> toList(List<MainCategories> mainCategories) {
        List<MainCategoriesDto> result = new LinkedList<>();
        mainCategories.forEach(element -> {
            result.add(new MainCategoriesDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
