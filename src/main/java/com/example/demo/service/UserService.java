package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    User createUser(User userDTO);
    List<User> getAllUser();
    UserDTO getDetail(Long id);

    List<UserDTO> getAllIntruder();

    UserDTO insertOrUpdate(UserDTO userDTO);

    UserDTO updateProfile(MultipartFile image, UserDTO user);
    UserDTO updateProfile(UserDTO user);
}
