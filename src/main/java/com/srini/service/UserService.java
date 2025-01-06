package com.srini.service;

import com.srini.exception.CustomException;
import com.srini.model.User;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserService {

	public static Map<Integer, User> listOfUsers() {

		Map<Integer, User> users = new HashMap<Integer, User>();
		users.put(1, new User(1, "SRINI", "Chennai", LocalDate.now()));
		users.put(2, new User(1, "GSLV", "Pune", LocalDate.now()));
		users.put(3, new User(1, "NITHYA", "K.giri", LocalDate.now()));
		users.put(4, new User(1, "PRIYA", "Bargur", LocalDate.now()));
		return users;
	}

	public User getUserById(String id) throws CustomException {

		if (StringUtils.isBlank(id)) {
			throw new CustomException("Id is null");
		}
		try {
			if (Integer.parseInt(id) > 0) {
				List<User> users = new ArrayList<>();
				users.add(new User(1, "SRINI", "Chennai", LocalDate.now()));
				users.add(new User(2, "GSLV", "Pune", LocalDate.now()));
				users.add(new User(3, "NITHYA", "K.giri", LocalDate.now()));
				users.add(new User(4, "PRIYA", "Bagur", LocalDate.now()));

				return users.stream().filter(user -> String.valueOf(user.getId()).equals(id)).findFirst()
						.orElseThrow(() -> new CustomException("Id Not found" + id));
			} else {
				throw new CustomException("Exception Occured Id:+" + id + "not found");
			}
		} catch (Exception e) {
			throw new CustomException("Exception Occured Id:+" + id + "not found and in Catch Block!");
		}
	}
}
