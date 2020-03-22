package kg.DiscountPlatform.service.categories;

import kg.DiscountPlatform.entity.Categories;

import java.util.List;

public interface CategoriesService {
    Categories addCategory(Categories categories);

    void deleteById(Long id);

    Categories changeCategory(Categories categories);

    Categories findById(Long id);

    List<Categories> findAllCategoriesByName(String name);

    List<Categories> findAll();
}
