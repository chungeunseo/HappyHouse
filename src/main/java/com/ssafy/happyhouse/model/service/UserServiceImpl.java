package com.ssafy.happyhouse.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.model.UserDTO;
import com.ssafy.happyhouse.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(UserDTO user) throws Exception {
		return sqlSession.getMapper(UserMapper.class).insert(user);		
	}

	@Override
	public int update(UserDTO user) throws Exception {
		return sqlSession.getMapper(UserMapper.class).update(user);
	}

	@Override
	public int delete(String userId) throws Exception {
		return sqlSession.getMapper(UserMapper.class).delete(userId);
	}

	@Override
	public UserDTO select(String userId) throws Exception {
		return sqlSession.getMapper(UserMapper.class).select(userId);
	}

	@Override
	public UserDTO login(String userId, String userPwd) throws Exception {		
		return sqlSession.getMapper(UserMapper.class).login(userId,userPwd);
	}

}
