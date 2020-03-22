package kg.DiscountPlatform.service.users;

import kg.DiscountPlatform.entity.Users;

import java.util.List;

public interface UsersService {
    Users addUser(Users users);

    void deleteById(Long id);

    Users changeUser(Users users);

    Users findById(Long id);

    List<Users> findAllUsersByUsername(String username);

    List<Users> findAll();
}
