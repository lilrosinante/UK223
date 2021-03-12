package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import ch.noser.uek223.domain.product.dto.ProductDTOAdmin;
import ch.noser.uek223.domain.product.dto.ProductDTOCustomer;
import ch.noser.uek223.domain.product.dto.ProductDTOSupplier;
import ch.noser.uek223.domain.role.Role;
import ch.noser.uek223.domain.role.dto.RoleDTO;
import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.dto.UserDTOAdmin;
import ch.noser.uek223.domain.user.dto.UserDTOCustomer;
import ch.noser.uek223.domain.user.dto.UserDTOSupplier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-12T11:59:38+0100",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.7.jar, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTOSupplier productToProductDTOSupplier(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTOSupplier productDTOSupplier = new ProductDTOSupplier();

        productDTOSupplier.setDescription( product.getDescription() );
        productDTOSupplier.setAvailability( product.getAvailability() );
        productDTOSupplier.setSupplier( userToUserDTOSupplier( product.getSupplier() ) );
        productDTOSupplier.setBuyPrice( product.getBuyPrice() );
        productDTOSupplier.setSellPrice( product.getSellPrice() );

        return productDTOSupplier;
    }

    @Override
    public ProductDTOCustomer productToProductDTOCustomer(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTOCustomer productDTOCustomer = new ProductDTOCustomer();

        productDTOCustomer.setDescription( product.getDescription() );
        productDTOCustomer.setAvailability( product.getAvailability() );
        productDTOCustomer.setSupplier( userToUserDTOCustomer( product.getSupplier() ) );
        productDTOCustomer.setSellPrice( product.getSellPrice() );

        return productDTOCustomer;
    }

    @Override
    public ProductDTOAdmin productToProductDTOAdmin(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTOAdmin productDTOAdmin = new ProductDTOAdmin();

        productDTOAdmin.setId( product.getId() );
        productDTOAdmin.setDescription( product.getDescription() );
        productDTOAdmin.setBuyPrice( product.getBuyPrice() );
        productDTOAdmin.setSellPrice( product.getSellPrice() );
        productDTOAdmin.setAvailability( product.getAvailability() );
        productDTOAdmin.setSupplier( userToUserDTOAdmin( product.getSupplier() ) );

        return productDTOAdmin;
    }

    @Override
    public List<ProductDTOSupplier> productsToProductDTOSupplier(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTOSupplier> list = new ArrayList<ProductDTOSupplier>( products.size() );
        for ( Product product : products ) {
            list.add( productToProductDTOSupplier( product ) );
        }

        return list;
    }

    @Override
    public List<ProductDTOCustomer> productsToProductDTOCustomer(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTOCustomer> list = new ArrayList<ProductDTOCustomer>( products.size() );
        for ( Product product : products ) {
            list.add( productToProductDTOCustomer( product ) );
        }

        return list;
    }

    @Override
    public List<ProductDTOAdmin> productsToProductDTOAdmin(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTOAdmin> list = new ArrayList<ProductDTOAdmin>( products.size() );
        for ( Product product : products ) {
            list.add( productToProductDTOAdmin( product ) );
        }

        return list;
    }

    protected UserDTOSupplier userToUserDTOSupplier(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTOSupplier userDTOSupplier = new UserDTOSupplier();

        userDTOSupplier.setFirstname( user.getFirstname() );
        userDTOSupplier.setSurname( user.getSurname() );
        userDTOSupplier.setEmail( user.getEmail() );

        return userDTOSupplier;
    }

    protected UserDTOCustomer userToUserDTOCustomer(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTOCustomer userDTOCustomer = new UserDTOCustomer();

        userDTOCustomer.setFirstname( user.getFirstname() );
        userDTOCustomer.setSurname( user.getSurname() );

        return userDTOCustomer;
    }

    protected AuthorityDTO authorityToAuthorityDTO(Authority authority) {
        if ( authority == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( authority.getId() );
        authorityDTO.setName( authority.getName() );

        return authorityDTO;
    }

    protected Set<AuthorityDTO> authoritySetToAuthorityDTOSet(Set<Authority> set) {
        if ( set == null ) {
            return null;
        }

        Set<AuthorityDTO> set1 = new HashSet<AuthorityDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Authority authority : set ) {
            set1.add( authorityToAuthorityDTO( authority ) );
        }

        return set1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );
        roleDTO.setAuthorities( authoritySetToAuthorityDTOSet( role.getAuthorities() ) );

        return roleDTO;
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new HashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }

    protected UserDTOAdmin userToUserDTOAdmin(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTOAdmin userDTOAdmin = new UserDTOAdmin();

        userDTOAdmin.setId( user.getId() );
        userDTOAdmin.setFirstname( user.getFirstname() );
        userDTOAdmin.setSurname( user.getSurname() );
        userDTOAdmin.setEmail( user.getEmail() );
        userDTOAdmin.setPassword( user.getPassword() );
        userDTOAdmin.setRoles( roleSetToRoleDTOSet( user.getRoles() ) );

        return userDTOAdmin;
    }
}
