package com.swiftly.demo.Service.Impl;
import com.swiftly.demo.DTO.LoginDTO;
import com.swiftly.demo.DTO.UserDTO;
import com.swiftly.demo.Entity.User;
import com.swiftly.demo.Repo.UserRepo;
import com.swiftly.demo.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Optional;
@Service
public class Impl implements Service {
    @Autowired
    private UserRepo UserRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO employeeDTO) {
        User user = new User(
                UserDTO.getId(),
                UserDTO.getName(),
                UserDTO.getEmail(),
                this.passwordEncoder.encode(UserDTO.getPassword())
        );
        UserRepo.save(user);
        return user.getName();
    }
    UserDTO employeeDTO;
    @Override
    public LoginResponse loginEmployee(LoginDTO loginDTO) {
        String msg = "";
        User user1 = UserRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = UserRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
}