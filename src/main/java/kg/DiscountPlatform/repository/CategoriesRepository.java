package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {
    @Query("SELECT c FROM Categories c WHERE lower(c.name) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(c.name)) ")
    List<Categories> findAllCategoriesByName(@Param("search") String name);

}
