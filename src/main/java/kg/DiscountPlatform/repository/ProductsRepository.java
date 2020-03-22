package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    @Query("SELECT p FROM Products p WHERE lower(p.name) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(p.name)) ")
    List<Products> findAllProductsByName(@Param("search") String name);

    List<Products> findAllSubCategoriesById(Long subCategoriesId);

    List<Products> findAllDiscountsById(Long discountsId);

    List<Products> findAllStocksById(Long stocksId);

}
