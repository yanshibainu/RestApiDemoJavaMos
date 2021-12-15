package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceStub {
	private static Map<Long, User> users = new HashMap<>();
	private static Long index = 2L;

	static{
		User user1 = new User(1L, "User1", "user1@gmail.com", "0001");
		User user2 = new User(2L, "User2", "user2@gmail.com", "0002");
		users.put(1L, user1);
		users.put(2L, user2);
	}

	public static List<User> getAllUsers(){
		return new ArrayList<>(users.values());
	}

	public static User getUserDetails(Long userId) {
		return users.get(userId);
	}

	public static User addUser(User user){
		index += 1;
		user.setId(index);
		users.put(index, user);
		return user;
	}
	public static User updateUser(Long userId, User user){
		user.setId(userId);
		users.put(userId, user);
		return user;
	}
	public static User deleteUser(Long userId){
		return users.remove(userId);
	}
}
