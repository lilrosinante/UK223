package ch.noser.uek223.domain.authority.dto;

import java.util.UUID;

public class AuthorityDTO {

    private UUID id;
    private String name;
    //private Set<RoleDTOAdmin> roles;

    public AuthorityDTO() {}

    public AuthorityDTO(UUID id, String name) {
        this.id = id;
        this.name = name;
        //this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public AuthorityDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AuthorityDTO setName(String name) {
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
