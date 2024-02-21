package com.swiftly.demo.Service;

import com.swiftly.demo.DTO.LoginDTO;
import com.swiftly.demo.DTO.UserDTO;
import com.swiftly.demo.response.LoginResponse;

public interface Service {
    String addUser(UserDTO userDTO);
    LoginResponse loginUser(LoginDTO loginDTO);
}