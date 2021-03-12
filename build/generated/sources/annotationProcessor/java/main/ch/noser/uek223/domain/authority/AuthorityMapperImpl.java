package ch.noser.uek223.domain.authority;

import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-12T11:59:38+0100",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.7.jar, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class AuthorityMapperImpl implements AuthorityMapper {

    @Override
    public AuthorityDTO authorityToAuthorityDTOAdmin(Authority authority) {
        if ( authority == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( authority.getId() );
        authorityDTO.setName( authority.getName() );

        return authorityDTO;
    }

    @Override
    public List<AuthorityDTO> authoritiesToAuthorityDTOAdmin(List<Authority> authorities) {
        if ( authorities == null ) {
            return null;
        }

        List<AuthorityDTO> list = new ArrayList<AuthorityDTO>( authorities.size() );
        for ( Authority authority : authorities ) {
            list.add( authorityToAuthorityDTOAdmin( authority ) );
        }

        return list;
    }
}
