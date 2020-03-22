package kg.DiscountPlatform.service.discounts;

import kg.DiscountPlatform.entity.Discounts;
import kg.DiscountPlatform.repository.DiscountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountsServiceImpl implements DiscountsService {
    @Autowired
    private DiscountsRepository discountsRepository;

    @Override
    public Discounts addDiscount(Discounts discounts) {
        return discountsRepository.save(discounts);
    }

    @Override
    public void deleteById(Long id) {
        discountsRepository.deleteById(id);
    }

    @Override
    public Discounts changeDiscount(Discounts discounts) {
        return discountsRepository.save(discounts);
    }

    @Override
    public Discounts findById(Long id) {
        return discountsRepository.findById(id).get();
    }

    @Override
    public List<Discounts> findAll() {
        return discountsRepository.findAll();
    }
}
