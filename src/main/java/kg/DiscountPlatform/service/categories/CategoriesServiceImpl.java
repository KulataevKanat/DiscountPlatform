package kg.DiscountPlatform.service.categories;

import kg.DiscountPlatform.entity.Categories;
import kg.DiscountPlatform.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Categories addCategory(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public void deleteById(Long id) {
        categoriesRepository.deleteById(id);
    }

    @Override
    public Categories changeCategory(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public Categories findById(Long id) {
        return categoriesRepository.findById(id).get();
    }

    @Override
    public List<Categories> findAllCategoriesByName(String name) {
        return categoriesRepository.findAllCategoriesByName(name);
    }

    @Override
    public List<Categories> findAllMainCategoriesById(Long mainCategoriesId) {
        return categoriesRepository.findAllMainCategoriesById(mainCategoriesId);
    }

    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }
}
