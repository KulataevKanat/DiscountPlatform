package kg.DiscountPlatform.security;

import kg.DiscountPlatform.entity.Roles;
import kg.DiscountPlatform.entity.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {
    public JwtUserFactory() {
    }

    public static UserDetailsImpl create(Users users) {
        return new UserDetailsImpl(users, grantedAuthorities(users.getRoles()));
    }

    public static List<GrantedAuthority> grantedAuthorities(Roles role) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role.toString()));
        return authorities;
    }
}
