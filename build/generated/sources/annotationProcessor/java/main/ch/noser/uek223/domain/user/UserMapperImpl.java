package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import ch.noser.uek223.domain.role.Role;
import ch.noser.uek223.domain.role.dto.RoleDTO;
import ch.noser.uek223.domain.user.dto.UserDTO;
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
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTOCustomer userToUserDTOCustomer(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTOCustomer userDTOCustomer = new UserDTOCustomer();

        userDTOCustomer.setFirstname( user.getFirstname() );
        userDTOCustomer.setSurname( user.getSurname() );

        return userDTOCustomer;
    }

    @Override
    public UserDTOSupplier userToUserDTOSupplier(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTOSupplier userDTOSupplier = new UserDTOSupplier();

        userDTOSupplier.setFirstname( user.getFirstname() );
        userDTOSupplier.setSurname( user.getSurname() );
        userDTOSupplier.setEmail( user.getEmail() );

        return userDTOSupplier;
    }

    @Override
    public UserDTOAdmin userToUserDTOAdmin(User user) {
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

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setFirstname( user.getFirstname() );
        userDTO.setSurname( user.getSurname() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPassword( user.getPassword() );

        return userDTO;
    }

    @Override
    public User userDTOToUser(UserDTO user) {
        if ( user == null ) {
            return null;
        }

        User user1 = new User();

        user1.setEmail( user.getEmail() );
        user1.setFirstname( user.getFirstname() );
        user1.setSurname( user.getSurname() );
        user1.setPassword( user.getPassword() );

        return user1;
    }

    @Override
    public List<UserDTOCustomer> usersToUserDTOCustomer(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTOCustomer> list = new ArrayList<UserDTOCustomer>( users.size() );
        for ( User user : users ) {
            list.add( userToUserDTOCustomer( user ) );
        }

        return list;
    }

    @Override
    public List<UserDTOSupplier> usersToUserDTOSupplier(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTOSupplier> list = new ArrayList<UserDTOSupplier>( users.size() );
        for ( User user : users ) {
            list.add( userToUserDTOSupplier( user ) );
        }

        return list;
    }

    @Override
    public List<UserDTOAdmin> usersToUserDTOAdmin(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTOAdmin> list = new ArrayList<UserDTOAdmin>( users.size() );
        for ( User user : users ) {
            list.add( userToUserDTOAdmin( user ) );
        }

        return list;
    }

    @Override
    public List<UserDTO> usersToUserDTO(List<User> user) {
        if ( user == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( user.size() );
        for ( User user1 : user ) {
            list.add( userToUserDTO( user1 ) );
        }

        return list;
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
}
