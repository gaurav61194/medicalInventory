package com.medicalInventory.exceptions;

public class UserAlreadyExistsException extends Exception {
 private static final long serialVersionUID = 1L;
 
 public UserAlreadyExistsException(String string) {
	 super(string);
 }
}
