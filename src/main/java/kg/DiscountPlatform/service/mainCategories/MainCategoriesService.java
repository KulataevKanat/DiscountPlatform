package kg.DiscountPlatform.service.mainCategories;

import kg.DiscountPlatform.entity.MainCategories;

import java.util.List;

public interface MainCategoriesService {
    MainCategories addMainCategory(MainCategories mainCategories);

    MainCategories deleteById(Long id);

    MainCategories changeMainCategory(MainCategories mainCategories);

    MainCategories findById(Long id);

    List<MainCategories> findAllMainCategoriesByName(String name);

    List<MainCategories> findAll();
}
