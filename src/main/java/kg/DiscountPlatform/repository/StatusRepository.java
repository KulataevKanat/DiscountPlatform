package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
    @Query("SELECT s FROM Status s WHERE lower(s.status) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(s.status)) ")
    List<Status> findAllStatusByStatus(@Param("search") String status);
}
