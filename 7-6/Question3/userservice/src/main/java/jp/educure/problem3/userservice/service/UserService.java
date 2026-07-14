package jp.educure.problem3.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jp.educure.problem3.userservice.repository.UserRepository;

@Component
public class UserService{	
	
	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String showData() {
		return userRepository.getUserData();
	}
}
