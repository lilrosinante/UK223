package ch.noser.uek223.domain.authority;

import ch.noser.uek223.domain.authority.dto.AuthorityDTOAdmin;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorityMapper {

    AuthorityDTOAdmin authorityToAuthorityDTOAdmin(Authority authority);

    List<AuthorityDTOAdmin> authoritiesToAuthorityDTOAdmin(List<Authority> authorities);

}
