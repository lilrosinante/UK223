package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.product.Availability;
import ch.noser.uek223.domain.user.dto.UserDTOSupplier;

public class ProductDTOSupplier {

    private String description;
    private float buyPrice;
    private float sellPrice;
    private Availability availability;
    private UserDTOSupplier supplier;

    public ProductDTOSupplier() {}

    public ProductDTOSupplier(String description, float buyPrice, float sellPrice, Availability availability, UserDTOSupplier supplier) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.availability = availability;
        this.supplier = supplier;
    }

    public String getDescription() {
        return description;
    }

    public ProductDTOSupplier setDescription(String description) {
        this.description = description;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public ProductDTOSupplier setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public UserDTOSupplier getSupplier() {
        return supplier;
    }

    public ProductDTOSupplier setSupplier(UserDTOSupplier supplier) {
        this.supplier = supplier;
        return this;
    }

    public float getBuyPrice() {
        return buyPrice;
    }

    public ProductDTOSupplier setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public ProductDTOSupplier setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }
}
