package ch.noser.uek223.domain.authority;

import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorityMapper {

    AuthorityDTO authorityToAuthorityDTOAdmin(Authority authority);

    List<AuthorityDTO> authoritiesToAuthorityDTOAdmin(List<Authority> authorities);

}
