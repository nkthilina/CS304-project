package com.example.demo.Controller;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        User newUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @PostMapping("/saveuser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @GetMapping("/getallusers")
    public List<UserDTO> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/getuser/{id}")
    public UserDTO getUser(@PathVariable int id){
        return service.getUser(id);
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "user Updated!";
    }
}
