package kg.DiscountPlatform.service.roles;

import kg.DiscountPlatform.entity.Roles;
import kg.DiscountPlatform.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public Roles addRole(Roles roles) {
        return rolesRepository.save(roles);
    }

    @Override
    public void deleteById(Long id) {
        rolesRepository.deleteById(id);
    }

    @Override
    public Roles changeRole(Roles roles) {
        return rolesRepository.save(roles);
    }

    @Override
    public Roles findById(Long id) {
        return rolesRepository.findById(id).get();
    }

    @Override
    public List<Roles> findAllRolesByRole(String role) {
        return rolesRepository.findAllRolesByRole(role);
    }

    @Override
    public List<Roles> findAll() {
        return rolesRepository.findAll();
    }
}
