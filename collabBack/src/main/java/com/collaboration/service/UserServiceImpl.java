package com.collaboration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collaboration.dao.UserDAO;
import com.collaboration.model.User;


@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserDAO userDAO;
	
	public boolean saveOrUpdate(User users) {

		return userDAO.saveOrUpdate(users);
	}

	public void delete(User user) {
		userDAO.delete(user);
		
	}

	/*public User getUser(String username) {
		return userDAO.getUser(username);
	}*/

	public User viewUser(int userid) {
		
		return userDAO.viewUser(userid);
	}

	public List<User> UserList() {
	
		return userDAO.UserList();
	}

	public User login(User user) {
		
		return userDAO.login(user);
	}

	public boolean isUsernameValid(String username) {
	
		return userDAO.isUsernameValid(username);
	}

	public boolean isEmailValid(String email) {
	
		return userDAO.isEmailValid(email);
	}

	public User updateUser(User users) {

		return userDAO.updateUser(users);
	}

	public User getUser(int userId) {
		return userDAO.getUser(userId);
	}

	public int getUser_id() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setUser_id(int user_id) {
		// TODO Auto-generated method stub
		
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		
	}

	public String getContact() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setContact(String contact) {
		// TODO Auto-generated method stub
		
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}

	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRole(String role) {
		// TODO Auto-generated method stub
		
	}

	public boolean isIsonline() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setIsonline(boolean isonline) {
		// TODO Auto-generated method stub
		
	}

	public boolean isEnable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setEnable(boolean enable) {
		// TODO Auto-generated method stub
		
	}

	
	
}