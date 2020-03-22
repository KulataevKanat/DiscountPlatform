package kg.DiscountPlatform.repository;

import kg.DiscountPlatform.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    @Query("SELECT u FROM Users u WHERE lower(u.username) LIKE coalesce(lower(cast(CONCAT('%',:search,'%') as text)), lower(u.username)) ")
    List<Users> findAllUsersByUsername(@Param("search") String username);

    Optional<Users> findByUsername(String username);

    List<Users> findAllRolesById(Long roleId);

    List<Users> findAllStatusesById(Long statusId);
}
