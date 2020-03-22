package kg.DiscountPlatform.service.networkCategories;

import kg.DiscountPlatform.entity.NetworkCategories;
import kg.DiscountPlatform.repository.NetworkCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkCategoriesServiceImpl implements NetworkCategoriesService {
    @Autowired
    private NetworkCategoriesRepository networkCategoriesRepository;

    @Override
    public NetworkCategories addNetworkCategory(NetworkCategories networkCategories) {
        return networkCategoriesRepository.save(networkCategories);
    }

    @Override
    public void deleteById(Long id) {
        networkCategoriesRepository.deleteById(id);
    }

    @Override
    public NetworkCategories changeNetworkCategory(NetworkCategories networkCategories) {
        return networkCategoriesRepository.save(networkCategories);
    }

    @Override
    public NetworkCategories findById(Long id) {
        return networkCategoriesRepository.findById(id).get();
    }

    @Override
    public List<NetworkCategories> findAllNetworkCategoriesByName(String name) {
        return networkCategoriesRepository.findAllNetworkCategoriesByName(name);
    }

    @Override
    public List<NetworkCategories> findAllCategoriesById(Long categoriesId) {
        return networkCategoriesRepository.findAllCategoriesById(categoriesId);
    }

    @Override
    public List<NetworkCategories> findAll() {
        return networkCategoriesRepository.findAll();
    }
}
