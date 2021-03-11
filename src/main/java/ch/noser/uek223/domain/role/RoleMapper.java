package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.role.dto.RoleDTOAdmin;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTOAdmin roleToRoleDTOAdmin(Role role);

    List<RoleDTOAdmin> rolesToRoleDTOAdmin(List<Role> roles);

}
