package kg.DiscountPlatform.service.subCategories;

import kg.DiscountPlatform.entity.SubCategories;
import kg.DiscountPlatform.repository.SubCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoriesServiceImpl implements SubCategoriesService {
    @Autowired
    private SubCategoriesRepository subCategoriesRepository;

    @Override
    public SubCategories addSubCategory(SubCategories subCategories) {
        return subCategoriesRepository.save(subCategories);
    }

    @Override
    public void deleteById(Long id) {
        subCategoriesRepository.deleteById(id);
    }

    @Override
    public SubCategories changeSubCategory(SubCategories subCategories) {
        return subCategoriesRepository.save(subCategories);
    }

    @Override
    public SubCategories findById(Long id) {
        return subCategoriesRepository.findById(id).get();
    }

    @Override
    public List<SubCategories> findAllSubCategoriesByName(String name) {
        return subCategoriesRepository.findAllSubCategoriesByName(name);
    }

    @Override
    public List<SubCategories> findAllNetworkCategoriesById(Long networkCategoriesId) {
        return subCategoriesRepository.findAllNetworkCategoriesById(networkCategoriesId);
    }


    @Override
    public List<SubCategories> findAll() {
        return subCategoriesRepository.findAll();
    }
}
