package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product_purchase.ProductPurchase;
import ch.noser.uek223.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private String description;

    @Column(nullable = false)
    private float buyPrice;

    @Column(nullable = false)
    private float sellPrice;

    @Enumerated(EnumType.ORDINAL)
    private Availability availability;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private User supplier;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private Set<ProductPurchase> productPurchases;

    public Product() {}

    public Product(UUID id, String description, float buyPrice, float sellPrice, Availability availability, User supplier, Set<ProductPurchase> productPurchases) {
        this.id = id;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.availability = availability;
        this.supplier = supplier;
        this.productPurchases = productPurchases;
    }

    public UUID getId() {
        return id;
    }

    public Product setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getBuyPrice() {
        return buyPrice;
    }

    public Product setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public Product setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }
    public Availability getAvailability() {
        return availability;
    }

    public Product setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public User getSupplier() {
        return supplier;
    }

    public Product setSupplier(User supplier) {
        this.supplier = supplier;
        return this;
    }

    public Set<ProductPurchase> getProductPurchases() {
        return productPurchases;
    }

    public Product setProductPurchases(Set<ProductPurchase> productPurchases) {
        this.productPurchases = productPurchases;
        return this;
    }
}