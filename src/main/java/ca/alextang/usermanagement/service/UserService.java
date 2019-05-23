package ca.alextang.usermanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import ca.alextang.usermanagement.shared.dto.UserDto;

public interface UserService extends UserDetailsService{

	UserDto createUser(UserDto user);
}
