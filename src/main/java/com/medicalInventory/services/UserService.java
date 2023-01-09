package com.medicalInventory.services;

import com.medicalInventory.dto.User;
import com.medicalInventory.exceptions.UserAlreadyExistsException;
import com.medicalInventory.exceptions.UserNotFoundException;

public interface UserService {

    Object addUser(User user)throws UserAlreadyExistsException;
    
    boolean login(String emailId, String password) throws UserNotFoundException;

}
