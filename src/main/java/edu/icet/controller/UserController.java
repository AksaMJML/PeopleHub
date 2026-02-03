package edu.icet.controller;

import edu.icet.model.dto.UserDTO;
import edu.icet.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Tag(name = "User", description = "APIs for Managing Users")
public class UserController {

    final UserService service;

    @PostMapping("/add")
    public void addUser(@RequestBody UserDTO userDTO) {
        service.addUser(userDTO);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody UserDTO userDTO) {
        service.updateUser(userDTO);
    }
}
