package ch.noser.uek223.domain.authority.dto;

import ch.noser.uek223.domain.role.dto.RoleDTOAdmin;

import java.util.Set;
import java.util.UUID;

public class AuthorityDTOAdmin {

    private UUID id;
    private String name;
    //private Set<RoleDTOAdmin> roles;

    public AuthorityDTOAdmin() {}

    public AuthorityDTOAdmin(UUID id, String name) {
        this.id = id;
        this.name = name;
        //this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public AuthorityDTOAdmin setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AuthorityDTOAdmin setName(String name) {
        this.name = name;
        return this;
    }

    /*public Set<RoleDTOAdmin> getRoles() {
        return roles;
    }

    public AuthorityDTOAdmin setRoles(Set<RoleDTOAdmin> roles) {
        this.roles = roles;
        return this;
    }*/
}
