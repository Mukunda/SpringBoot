package com.coreflex.restwebservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coreflex.restwebservice.bean.User;

@Component
public class UserService {

	private static List<User> users = new ArrayList<User>();

	private static int userCounter = 3;

	static {
		users.add(new User(1, "Mukunda", new Date()));
		users.add(new User(2, "Siri", new Date()));
		users.add(new User(3, "Ananada", new Date()));
	}

	public List<User> retrieveUsers() {
		return users;
	}

	public User addUser(User user) {
		if (user.getId() == null) {
			user.setId(++userCounter);
		}
		users.add(user);
		return user;
	}

	public User findUserById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;

	}

	public User removeUser(int id) {

		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;

	}
}
