package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return UserServiceStub.getAllUsers();
	}

	@GetMapping("/user/{userId}")
	public User getUserDetails(@PathVariable Long userId){
		return UserServiceStub.getUserDetails(userId);
	}

	@PostMapping("/adduser")
	public User addUser(@RequestBody User user){
		return UserServiceStub.addUser(user);
	}

	@PutMapping("/updateUser/{userId}")
	public User updateUser(@PathVariable Long userId, @RequestBody User user){
		return UserServiceStub.updateUser(userId, user);
	}

	@DeleteMapping("/deleteUser/{userId}")
	public User deleteUser(@PathVariable Long userId){
		return UserServiceStub.deleteUser(userId);
	}


}
