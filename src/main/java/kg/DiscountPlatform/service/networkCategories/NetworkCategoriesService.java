package kg.DiscountPlatform.service.networkCategories;

import kg.DiscountPlatform.entity.NetworkCategories;

import java.util.List;

public interface NetworkCategoriesService {
    NetworkCategories addNetworkCategory(NetworkCategories networkCategories);

    NetworkCategories deleteById(Long id);

    NetworkCategories changeNetworkCategory(NetworkCategories networkCategories);

    NetworkCategories findById(Long id);

    List<NetworkCategories> findAllNetworkCategoriesByName(String name);

    List<NetworkCategories> findAll();
}
