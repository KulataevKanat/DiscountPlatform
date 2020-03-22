package kg.DiscountPlatform.service.users;

import kg.DiscountPlatform.entity.Users;
import kg.DiscountPlatform.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users addUser(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public Users changeUser(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Users findById(Long id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public List<Users> findAllUsersByUsername(String username) {
        return usersRepository.findAllUsersByUsername(username);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }
}
