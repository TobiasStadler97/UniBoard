package UniBoard.controller;

import UniBoard.entity.users.User;
import UniBoard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    User getUser(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping("/user")
    void newUser(@RequestBody User newUser){
        userService.save(newUser);
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable int id){
        userService.deleteById(id);
    }
}
