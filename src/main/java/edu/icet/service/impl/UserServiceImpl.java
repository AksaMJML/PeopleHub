package edu.icet.service.impl;

import edu.icet.model.dto.UserDTO;
import edu.icet.model.entity.UserEntity;
import edu.icet.repositery.UserRepositery;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    final UserRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addUser(UserDTO userDTO) {
        repositery.save(mapper.map(userDTO , UserEntity.class));
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        repositery.save(mapper.map(userDTO , UserEntity.class));
    }

    @Override
    public void deleteUser(Integer userId) {
        repositery.deleteById(userId);
    }

    @Override
    public UserDTO searchByUserId(Integer userId) {
        UserEntity userEntity = repositery.findById(userId).get();
        UserDTO userDTO = mapper.map(userEntity, UserDTO.class);
        return userDTO;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}
