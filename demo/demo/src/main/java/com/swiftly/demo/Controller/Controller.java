package com.swiftly.demo.Controller;
import com.swiftly.demo.DTO.UserDTO;
import com.swiftly.demo.Service.Service;
import com.swiftly.demo.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class Controller {
    @Autowired
    private Service service;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody UserDTO employeeDTO)
    {
        String id = service.addUser(employeeDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = service.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}