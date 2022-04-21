package com.foodapp;



public class UserValidator {
	/*This method is used to validate the user details*/
	public static void validatorUserDetails(User user) throws Exception {
		try {
		if(user.getName() == null) {
			throw new Exception("Invalid Name");
		}
		else if(user.getEmail()== null|| !(user.getEmail()).contains("@gmail.com")) {
			throw new Exception("Invalid Email");
		}
		else if(user.getContactNumber().length()!=10) {
			throw new Exception("Invalid Contact number: pls..declare the 10 digit");
		}
		else if(user.getCreatePassword()==null) {
			throw new Exception("Invalid password");
		}
		else if(user.getCreatePassword().length()<8) {
			throw new Exception("Password must be minimum 8 digit");
		}
		else if(user.getConformPassword()==null) {
			throw new Exception("Invalid conform password");
		}
		else if(!user.getConformPassword().equals(user.getCreatePassword())) {
			throw new Exception("Password not match");
		}
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());	
		}
		
	}
}
