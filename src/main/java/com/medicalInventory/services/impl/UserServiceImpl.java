
package com.medicalInventory.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalInventory.dto.User;
import com.medicalInventory.exceptions.UserAlreadyExistsException;
import com.medicalInventory.exceptions.UserNotFoundException;
import com.medicalInventory.services.UserService;
import com.medicalInventory.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	private UserRepository userRepo;

	@Override
	public Object addUser(User user) throws UserAlreadyExistsException {
		User existingUser = userRepo.findByEmailId(user.getEmailId()).orElse(null);
		if(existingUser == null) {
			return userRepo.save(user);
		}else {
			return "User Already Exists!";
		}
	}
	
	@Override
    public boolean login(String emailId, String password) throws UserNotFoundException
    {
        User user = userRepo.findByEmailId(emailId, password)
                .orElseThrow(() -> new UserNotFoundException("Invalid User!"));
        return user.getPassword().equals(password);
    }

	}
