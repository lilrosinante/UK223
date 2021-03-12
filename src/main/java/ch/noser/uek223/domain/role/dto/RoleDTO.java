package ch.noser.uek223.domain.role.dto;

import ch.noser.uek223.domain.authority.dto.AuthorityDTO;

import java.util.Set;
import java.util.UUID;

public class RoleDTO {

    private UUID id;
    private String name;
    //private Set<UserDTOAdmin> users;
    private Set<AuthorityDTO> authorities;

    public RoleDTO() {}

    public RoleDTO(UUID id, String name, Set<AuthorityDTO> authorities) {
        this.id = id;
        this.name = name;
        this.authorities = authorities;
    }

    public UUID getId() {
        return id;
    }

    public RoleDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RoleDTO setName(String name) {
        this.name = name;
        return this;
    }

    /*public Set<UserDTOAdmin> getUsers() {
        return users;
    }

    public RoleDTOAdmin setUsers(Set<UserDTOAdmin> users) {
        this.users = users;
        return this;
    }*/

    public Set<AuthorityDTO> getAuthorities() {
        return authorities;
    }

    public RoleDTO setAuthorities(Set<AuthorityDTO> authorities) {
        this.authorities = authorities;
        return this;
    }
}
