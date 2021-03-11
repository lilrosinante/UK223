package ch.noser.uek223.domain.user.unittesting;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.role.Role;
import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.UserRepository;
import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@TestPropertySource("classpath:application-test.properties")
public class UserRepositoryUnitTest {
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private UserRepository userRepository;
    private User userToBeTestedAgainst1;
    private User userToBeTestedAgainst2;
    private User newUserToBeSaved;
    private List<User> listOfUsersToBeTestedAgainst;
    UUID userIdFromDBUser1;
    UUID userIdFromDBUser2;
    List<UUID> listOfIdsFromDB;

    @BeforeEach
    public void setUp() {
        Set<Authority> authoritiesToBeTestedAgainst = Stream.of(new Authority().setName("USER_SEE"), new Authority().setName("USER_CREATE"), new Authority().setName("USER_MODIFY"), new Authority().setName("USER_DELETE")).collect(Collectors.toSet());
        Set<Role> rolesToBeTestedAgainst = Stream.of(new Role().setName("BASIC_USER").setAuthorities(authoritiesToBeTestedAgainst)).collect(Collectors.toSet());
        userToBeTestedAgainst1 = new User(UUID.randomUUID(), "john.doe@noseryoung.ch", "John", "Doe", new BCryptPasswordEncoder().encode(UUID.randomUUID().toString()),null, null, null);
        userToBeTestedAgainst2 = new User(UUID.randomUUID(), "jane.doe@noseryoung.ch", "Jane", "Doe", new BCryptPasswordEncoder().encode(UUID.randomUUID().toString()), null, null, null);
        newUserToBeSaved = new User().setFirstname("Jack").setSurname("Doe").setEmail("jack.doe@noseryoung.ch").setPassword(new BCryptPasswordEncoder().encode(UUID.randomUUID().toString())).setRoles(rolesToBeTestedAgainst);
        listOfUsersToBeTestedAgainst = Arrays.asList(userToBeTestedAgainst1, userToBeTestedAgainst2);
        listOfIdsFromDB = Arrays.asList(userIdFromDBUser1, userIdFromDBUser2);
        userIdFromDBUser1 = testEntityManager.persistAndGetId(userToBeTestedAgainst1, UUID.class);
        userIdFromDBUser2 = testEntityManager.persistAndGetId(userToBeTestedAgainst2, UUID.class);
    }

    @Test
    public void findById_requestUserById_returnsUser() {
        Optional<User> userFromDB = userRepository.findById(userIdFromDBUser1);
        Assertions.assertThat(userFromDB).isEqualTo(Optional.ofNullable(userToBeTestedAgainst1));
        Assertions.assertThat(userFromDB.get().getId()).isEqualTo(userIdFromDBUser1);
        Assertions.assertThat(userFromDB.get().getFirstname()).isEqualTo(userToBeTestedAgainst1.getFirstname());
        Assertions.assertThat(userFromDB.get().getSurname()).isEqualTo(userToBeTestedAgainst1.getSurname());
        Assertions.assertThat(userFromDB.get().getEmail()).isEqualTo(userToBeTestedAgainst1.getEmail());
        Assertions.assertThat(userFromDB.get().getPassword()).isEqualTo(userToBeTestedAgainst1.getPassword());
        Assertions.assertThat(userFromDB.get().getRoles()).isEqualTo(userToBeTestedAgainst1.getRoles());
    }
}
