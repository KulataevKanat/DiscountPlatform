package kg.DiscountPlatform.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "network_categories")
public class NetworkCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;

    @Column(name = "name", columnDefinition = "varchar")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categories_id", columnDefinition = "integer")
    private Categories categories;

    @OneToMany(mappedBy = "network_categories", cascade = CascadeType.ALL)
    private List<SubCategories> subCategories;

    public NetworkCategories() {
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

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public List<SubCategories> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategories> subCategories) {
        this.subCategories = subCategories;
    }
}
