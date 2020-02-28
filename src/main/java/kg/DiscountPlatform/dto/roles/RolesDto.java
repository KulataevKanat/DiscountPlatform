package kg.DiscountPlatform.dto.roles;

import kg.DiscountPlatform.entity.Roles;

import java.util.LinkedList;
import java.util.List;

public class RolesDto {
    private Long id;
    private String role;

    public RolesDto(Roles roles) {
        this.id = roles.getId();
        this.role = roles.getRole();
    }

    public static List<RolesDto> toList(List<Roles> roles) {
        List<RolesDto> result = new LinkedList<>();
        roles.forEach(element -> {
            result.add(new RolesDto(element));
        });
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}
