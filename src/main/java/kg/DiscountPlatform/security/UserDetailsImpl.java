package kg.DiscountPlatform.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.DiscountPlatform.entity.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

public class UserDetailsImpl implements UserDetails {
    private Long id;
    private String username;
    private String password;
    private String status;
    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl() {
    }

    public UserDetailsImpl(Users users, Collection<? extends GrantedAuthority> authorities) {
        this.id = users.getId();
        this.username = users.getUsername();
        this.password = users.getPassword();
        this.authorities = authorities;
        this.status = users.getStatus().toString();
    }

    public Long getId() {
        return id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public static UserDetailsImpl getAuthenticationPrincipal() {
        final Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) return (UserDetailsImpl) principal;
        throw new UsernameNotFoundException("Authentication filed");
    }
}
