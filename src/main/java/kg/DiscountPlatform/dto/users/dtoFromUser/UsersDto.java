package kg.DiscountPlatform.dto.users.dtoFromUser;

import kg.DiscountPlatform.entity.Users;

import java.util.LinkedList;
import java.util.List;

public class UsersDto {
    private String username;
    private String password;
    private String mail;

    public UsersDto(Users users) {
        this.username = users.getUsername();
        this.password = users.getPassword();
        this.mail = users.getMail();
    }

    public static List<UsersDto> toList(List<Users> users) {
        List<UsersDto> result = new LinkedList<>();
        users.forEach(element -> {
            result.add(new UsersDto(element));
        });
        return result;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }
}
