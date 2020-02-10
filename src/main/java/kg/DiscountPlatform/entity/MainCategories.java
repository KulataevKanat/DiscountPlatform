package kg.DiscountPlatform.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "main_categories")
public class MainCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;

    @Column(name = "name", columnDefinition = "varchar")
    private String name;

    @OneToMany(mappedBy = "mainCategories", cascade = CascadeType.ALL)
    private List<Categories> categories;

    public MainCategories() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }
}
