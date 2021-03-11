package ch.noser.uek223.domain.role.dto;

import ch.noser.uek223.domain.authority.dto.AuthorityDTOAdmin;

import java.util.Set;
import java.util.UUID;

public class RoleDTOAdmin{

    private UUID id;
    private String name;
    //private Set<UserDTOAdmin> users;
    private Set<AuthorityDTOAdmin> authorities;

    public RoleDTOAdmin() {}

    public RoleDTOAdmin(UUID id, String name, Set<AuthorityDTOAdmin> authorities) {
        this.id = id;
        this.name = name;
        this.authorities = authorities;
    }

    public UUID getId() {
        return id;
    }

    public RoleDTOAdmin setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RoleDTOAdmin setName(String name) {
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

    public Set<AuthorityDTOAdmin> getAuthorities() {
        return authorities;
    }

    public RoleDTOAdmin setAuthorities(Set<AuthorityDTOAdmin> authorities) {
        this.authorities = authorities;
        return this;
    }
}
