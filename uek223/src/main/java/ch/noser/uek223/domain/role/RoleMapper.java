package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.role.dto.RoleDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTO roleToRoleDTOAdmin(Role role);

    List<RoleDTO> rolesToRoleDTOAdmin(List<Role> roles);

}
