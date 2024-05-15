package com.lamis.medicament.service;


import com.lamis.medicament.entities.Role;
import com.lamis.medicament.entities.User;

public interface UserService {
	void deleteAllusers();
	void deleteAllRoles();
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
}
