package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.SubCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoriesRepository extends JpaRepository<SubCategories, Long> {
    @Query("SELECT sc FROM SubCategories sc WHERE lower(sc.name) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(sc.name)) ")
    List<SubCategories> findAllSubCategoriesByName(@Param("search") String name);

    List<SubCategories> findAllNetworkCategoriesById(Long networkCategoriesId);
}
