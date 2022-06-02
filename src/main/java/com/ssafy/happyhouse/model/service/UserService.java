package com.ssafy.happyhouse.model.service;


import com.ssafy.happyhouse.model.UserDTO;

public interface UserService {
	public int insert(UserDTO user) throws Exception;
	public int update(UserDTO user) throws Exception;
	public int delete(String userId) throws Exception;	
	public UserDTO select(String userId) throws Exception;	
	public UserDTO login(String userId, String userPwd) throws Exception;
}
