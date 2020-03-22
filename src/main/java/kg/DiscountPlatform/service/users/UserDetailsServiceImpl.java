package kg.DiscountPlatform.service.users;

import kg.DiscountPlatform.entity.MainCategories;
import kg.DiscountPlatform.entity.Users;
import kg.DiscountPlatform.repository.UsersRepository;
import kg.DiscountPlatform.security.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepository.findByUsername(username).orElseThrow(() -> {
            throw new NoSuchElementException("could not find user by username: " + username);
        });
        return JwtUserFactory.create(users);
    }
}
