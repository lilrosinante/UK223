package ch.noser.uek223.domain.user.dto;

public class UserDTOSupplier {

    private String firstname;
    private String surname;
    private String email;

    public UserDTOSupplier() {}

    public UserDTOSupplier(String firstname, String surname, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public UserDTOSupplier setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTOSupplier setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTOSupplier setEmail(String email) {
        this.email = email;
        return this;
    }
}
