package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.product.Availability;
import ch.noser.uek223.domain.user.dto.UserDTOAdmin;

import java.util.UUID;

public class ProductDTOAdmin {

    private UUID id;
    private String description;
    private float buyPrice;
    private float sellPrice;
    private Availability availability;
    private UserDTOAdmin supplier;

    public ProductDTOAdmin() {}

    public ProductDTOAdmin(UUID id, String description, float buyPrice, float sellPrice, Availability availability, UserDTOAdmin supplier) {
        this.id = id;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.availability = availability;
        this.supplier = supplier;
    }

    public UUID getId() {
        return id;
    }

    public ProductDTOAdmin setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductDTOAdmin setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getBuyPrice() {
        return buyPrice;
    }

    public ProductDTOAdmin setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public ProductDTOAdmin setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public ProductDTOAdmin setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public UserDTOAdmin getSupplier() {
        return supplier;
    }

    public ProductDTOAdmin setSupplier(UserDTOAdmin supplier) {
        this.supplier = supplier;
        return this;
    }
}
