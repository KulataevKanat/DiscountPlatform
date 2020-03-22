package kg.DiscountPlatform.service.products;

import kg.DiscountPlatform.entity.Products;

import java.util.List;

public interface ProductsService {
    Products addProduct(Products products);

    void deleteById(Long id);

    Products changeProduct(Products products);

    Products findById(Long id);

    List<Products> findAllProductsByName(String name);

    List<Products> findAll();
}
