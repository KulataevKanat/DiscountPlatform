package kg.DiscountPlatform.service.roles;

import kg.DiscountPlatform.entity.Roles;

import java.util.List;

public interface RolesService {
    Roles addRole(Roles roles);

    Roles deleteById(Long id);

    Roles changeRole(Roles roles);

    Roles findById(Long id);

    List<Roles> findAllRolesByRole(String role);

    List<Roles> findAll();
}
