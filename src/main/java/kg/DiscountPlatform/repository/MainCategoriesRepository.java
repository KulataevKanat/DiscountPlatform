package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.MainCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainCategoriesRepository extends JpaRepository<MainCategories, Long> {
    @Query("SELECT mc FROM MainCategories mc WHERE lower(mc.name) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(mc.name)) ")
    List<MainCategories> findMainCategoriesByName(@Param("search") String name);
}
