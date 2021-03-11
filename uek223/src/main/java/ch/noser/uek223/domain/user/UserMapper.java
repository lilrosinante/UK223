package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.user.dto.UserDTO;
import ch.noser.uek223.domain.user.dto.UserDTOAdmin;
import ch.noser.uek223.domain.user.dto.UserDTOCustomer;
import ch.noser.uek223.domain.user.dto.UserDTOSupplier;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTOCustomer userToUserDTOCustomer(User user);
    UserDTOSupplier userToUserDTOSupplier(User user);
    UserDTOAdmin userToUserDTOAdmin(User user);
    //JWT
    UserDTO userToUserDTO(User user);
    User userDTOToUser(UserDTO user);

    List<UserDTOCustomer> usersToUserDTOCustomer(List<User> users);
    List<UserDTOSupplier> usersToUserDTOSupplier(List<User> users);
    List<UserDTOAdmin> usersToUserDTOAdmin(List<User> users);
    List<UserDTO> usersToUserDTO(List<User> user);

}
