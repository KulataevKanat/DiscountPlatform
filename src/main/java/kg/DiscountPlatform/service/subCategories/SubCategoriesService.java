package kg.DiscountPlatform.service.subCategories;

import kg.DiscountPlatform.entity.SubCategories;

import java.util.List;

public interface SubCategoriesService {
    SubCategories addSubCategory(SubCategories subCategories);

    void deleteById(Long id);

    SubCategories changeSubCategory(SubCategories subCategories);

    SubCategories findById(Long id);

    List<SubCategories> findAllSubCategoriesByName(String name);

    List<SubCategories> findAllNetworkCategoriesById(Long networkCategoriesId);

    List<SubCategories> findAll();
}
