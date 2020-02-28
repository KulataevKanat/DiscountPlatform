package kg.DiscountPlatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;

    @Column(name = "mail", columnDefinition = "varchar(50)")
    private String mail;

    @Column(name = "username", columnDefinition = "varchar(20)")
    private String username;

    @Column(name = "user_password", columnDefinition = "varchar(100)")
    private String password;

    @ManyToOne
    @JoinColumn(name = "roles_id", columnDefinition = "integer")
    private Roles roles;

    @ManyToOne
    @JoinColumn(name = "status_id", columnDefinition = "integer")
    private Status status;

    public Users() {
        this.roles = new Roles("ROLE_USER");
        this.status = new Status("user");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
