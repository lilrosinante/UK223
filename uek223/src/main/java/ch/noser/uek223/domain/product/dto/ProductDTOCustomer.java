package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.product.Availability;
import ch.noser.uek223.domain.user.dto.UserDTOCustomer;

public class ProductDTOCustomer {

    private String description;
    private float sellPrice;
    private Availability availability;
    private UserDTOCustomer supplier;

    public ProductDTOCustomer() {}

    public ProductDTOCustomer(String description, float sellPrice, Availability availability, UserDTOCustomer supplier) {
        this.description = description;
        this.sellPrice = sellPrice;
        this.availability = availability;
        this.supplier = supplier;
    }

    public String getDescription() {
        return description;
    }

    public ProductDTOCustomer setDescription(String description) {
        this.description = description;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public ProductDTOCustomer setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public UserDTOCustomer getSupplier() {
        return supplier;
    }

    public ProductDTOCustomer setSupplier(UserDTOCustomer supplier) {
        this.supplier = supplier;
        return this;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public ProductDTOCustomer setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }
}
