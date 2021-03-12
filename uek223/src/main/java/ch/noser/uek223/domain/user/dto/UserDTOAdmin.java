package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dto.RoleDTO;

import java.util.Set;
import java.util.UUID;

public class UserDTOAdmin {

    private UUID id;
    private String firstname;
    private String surname;
    private String email;
    private String password;
    private Set<RoleDTO> roles;

    public UserDTOAdmin() {}

    public UserDTOAdmin(UUID id, String firstname, String surname, String email, String password, Set<RoleDTO> roles) {

        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public UserDTOAdmin setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public UserDTOAdmin setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTOAdmin setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTOAdmin setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTOAdmin setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public UserDTOAdmin setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
        return this;
    }
}
