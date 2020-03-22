package kg.DiscountPlatform.service.discounts;

import kg.DiscountPlatform.entity.Discounts;

import java.util.List;

public interface DiscountsService {
    Discounts addDiscount(Discounts discounts);

    void deleteById(Long id);

    Discounts changeDiscount(Discounts discounts);

    Discounts findById(Long id);

    List<Discounts> findAll();
}
