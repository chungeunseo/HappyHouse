package com.ssafy.happyhouse.model.mapper;

import java.sql.SQLException;

import com.ssafy.happyhouse.model.UserDTO;

public interface UserMapper {
	public int insert(UserDTO user) throws SQLException;
	public int update(UserDTO user) throws SQLException;
	public int delete(String userId) throws SQLException;
	
	public UserDTO select(String userId) throws SQLException;
	
	public UserDTO login(String userId, String userPwd) throws SQLException;
}
