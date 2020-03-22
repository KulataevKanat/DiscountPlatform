package kg.DiscountPlatform.service.mainCategories;

import kg.DiscountPlatform.entity.MainCategories;
import kg.DiscountPlatform.repository.MainCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainCategoriesServiceImpl implements MainCategoriesService {
    @Autowired
    private MainCategoriesRepository mainCategoriesRepository;

    @Override
    public MainCategories addMainCategory(MainCategories mainCategories) {
        return mainCategoriesRepository.save(mainCategories);
    }

    @Override
    public void deleteById(Long id) {
        mainCategoriesRepository.deleteById(id);
    }

    @Override
    public MainCategories changeMainCategory(MainCategories mainCategories) {
        return mainCategoriesRepository.save(mainCategories);
    }

    @Override
    public MainCategories findById(Long id) {
        return mainCategoriesRepository.findById(id).get();
    }

    @Override
    public List<MainCategories> findAllMainCategoriesByName(String name) {
        return mainCategoriesRepository.findAllMainCategoriesByName(name);
    }

    @Override
    public List<MainCategories> findAll() {
        return mainCategoriesRepository.findAll();
    }
}
