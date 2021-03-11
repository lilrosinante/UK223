package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.ProductDTOAdmin;
import ch.noser.uek223.domain.product.dto.ProductDTOSupplier;
import ch.noser.uek223.domain.product.dto.ProductDTOCustomer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTOSupplier productToProductDTOSupplier(Product product);
    ProductDTOCustomer productToProductDTOCustomer(Product product);
    ProductDTOAdmin productToProductDTOAdmin(Product product);

    List<ProductDTOSupplier> productsToProductDTOSupplier(List<Product> products);
    List<ProductDTOCustomer> productsToProductDTOCustomer(List<Product> products);
    List<ProductDTOAdmin> productsToProductDTOAdmin(List<Product> products);

}
