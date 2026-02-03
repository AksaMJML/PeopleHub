package edu.icet.service;

import edu.icet.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    void addUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(Integer userId);
    UserDTO searchByUserId(Integer userId);
    List<UserDTO> getAllUsers();
}
