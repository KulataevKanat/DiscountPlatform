package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.NetworkCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NetworkCategoriesRepository extends JpaRepository<NetworkCategories, Long> {
    @Query("SELECT nt FROM NetworkCategories nt WHERE lower(nt.name) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(nt.name)) ")
    List<NetworkCategories> findAllNetworkCategoriesByName(@Param("search") String name);
}
