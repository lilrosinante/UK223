package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.user.dto.UserDTO;
import ch.noser.uek223.domain.user.dto.UserDTOAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserWeb {

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserWeb(UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping({"/", ""})
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTOAdmin> findById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(userMapper.userToUserDTOAdmin(userService.findById(id)));
    }

    @PostMapping()
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO user) {
        return new ResponseEntity<UserDTO>(userMapper.userToUserDTO(userService.create(userMapper.userDTOToUser(user))), HttpStatus.CREATED);
    }

}
