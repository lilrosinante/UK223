package ch.noser.uek223.domain.user.dto;

public class UserDTO {

    private String firstname;

    private String surname;

    private String email;

    private String password;

    public UserDTO() {}

    public UserDTO(String firstname, String surname, String email, String password) {

        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.password = password;

    }

    public String getFirstname() {
        return firstname;
    }

    public UserDTO setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }
}
