package kg.DiscountPlatform.service.products;

import kg.DiscountPlatform.entity.Products;
import kg.DiscountPlatform.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public Products addProduct(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public void deleteById(Long id) {
        productsRepository.deleteById(id);
    }

    @Override
    public Products changeProduct(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public Products findById(Long id) {
        return productsRepository.findById(id).get();
    }

    @Override
    public List<Products> findAllProductsByName(String name) {
        return productsRepository.findAllProductsByName(name);
    }

    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }
}
