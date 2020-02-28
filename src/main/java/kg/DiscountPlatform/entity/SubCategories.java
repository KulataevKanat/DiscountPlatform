package kg.DiscountPlatform.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sub_categories")
public class SubCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;

    @Column(name = "name", columnDefinition = "varchar")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "network_categories_id", columnDefinition = "integer")
    private NetworkCategories networkCategories;

    @OneToMany(mappedBy = "subCategories", cascade = CascadeType.ALL)
    private List<Products> products;

    public SubCategories() {

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

    public NetworkCategories getNetworkCategories() {
        return networkCategories;
    }

    public void setNetworkCategories(NetworkCategories networkCategories) {
        this.networkCategories = networkCategories;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
