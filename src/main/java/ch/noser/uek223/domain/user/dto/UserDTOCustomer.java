package ch.noser.uek223.domain.user.dto;

public class UserDTOCustomer {

    private String firstname;
    private String surname;

    public UserDTOCustomer() {}

    public UserDTOCustomer(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public UserDTOCustomer setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTOCustomer setSurname(String surname) {
        this.surname = surname;
        return this;
    }
}
