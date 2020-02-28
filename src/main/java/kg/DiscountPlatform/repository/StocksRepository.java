package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Long> {
    @Query("SELECT s FROM Stocks s WHERE lower(s.name) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(s.name)) ")
    List<Stocks> findStocksByName(@Param("search") String name);
}
