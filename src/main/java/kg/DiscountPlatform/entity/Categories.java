package kg.DiscountPlatform.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;

    @Column(name = "name", columnDefinition = "varchar")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_categories_id", columnDefinition = "integer")
    private MainCategories mainCategories;

    @OneToMany(mappedBy = "categories", cascade = CascadeType.ALL)
    private List<NetworkCategories> networkCategories;

    public Categories() {
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

    public MainCategories getMainCategories() {
        return mainCategories;
    }

    public void setMainCategories(MainCategories mainCategories) {
        this.mainCategories = mainCategories;
    }

    public List<NetworkCategories> getNetworkCategories() {
        return networkCategories;
    }

    public void setNetworkCategories(List<NetworkCategories> networkCategories) {
        this.networkCategories = networkCategories;
    }
}
