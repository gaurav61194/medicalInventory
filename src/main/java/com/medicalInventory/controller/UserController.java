package com.medicalInventory.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medicalInventory.dto.User;
import com.medicalInventory.exceptions.UserNotFoundException;
import com.medicalInventory.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	Log logger = LogFactory.getLog(UserController.class);
	
	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
    public Object addUser(@Valid @RequestBody User user) throws Throwable
    {
		return userService.addUser(user);
	
        
    }
	
	@GetMapping("/login")
    public ResponseEntity<Object> login(@RequestParam String emailId, String password) throws Throwable
    {
        try {
            userService.login(emailId, password);
            return ResponseEntity.ok("User Logged In!");
        }
        catch(UserNotFoundException u) {
            return ResponseEntity.ok().body(u.getMessage());
        }
    }

	
}
