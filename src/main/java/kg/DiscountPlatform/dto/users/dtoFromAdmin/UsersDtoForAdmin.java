package kg.DiscountPlatform.dto.users.dtoFromAdmin;

import kg.DiscountPlatform.entity.Users;

import java.util.LinkedList;
import java.util.List;

public class UsersDtoForAdmin {
    private Long id;
    private String username;
    private String mail;
    private List<String> roles;

    public UsersDtoForAdmin(Users users) {
        this.id = users.getId();
        this.username = users.getUsername();
        this.mail = users.getMail();
        this.roles = users.getRoles();
    }

    public static List<UsersDtoForAdmin> toListForAdmin(List<Users> users){
        List<UsersDtoForAdmin> result = new LinkedList<>();
        users.forEach(element -> {
            result.add(new UsersDtoForAdmin(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public List<String> getRoles() {
        return roles;
    }
}
