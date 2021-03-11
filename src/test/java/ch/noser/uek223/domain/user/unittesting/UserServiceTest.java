package ch.noser.uek223.domain.user.unittesting;

import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.UserRepository;
import ch.noser.uek223.domain.user.UserServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.UUID;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    private UserRepository userRepository;

    UUID id;
    User expectedUser;

    @BeforeAll
    public void setUp() {
        id = UUID.randomUUID();
        expectedUser = new User(id, "jacky.tran@hotmail.com", "Jacky", "Tran", "123", null, null, null);
    }

    @Test
    public void findById_getUser_returnUser() {

        Mockito.when(userRepository.findById(id)).thenReturn(java.util.Optional.of(expectedUser));
        User actualUser = userService.findById(id);

        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void create_HappyPath_True(){
        Mockito.when(userRepository.findByEmail(expectedUser.getEmail())).thenReturn(Optional.empty());
        Mockito.when(userRepository.saveAndFlush(expectedUser)).thenReturn(expectedUser);
        User actualUser = userService.create(expectedUser);
        assertEquals(expectedUser.getEmail(), actualUser.getEmail());
    }

}
