package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
    @Query("SELECT r FROM Roles r WHERE lower(r.role) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(r.role)) ")
    List<Roles> findAllRolesByRole(@Param("search") String role);
}
