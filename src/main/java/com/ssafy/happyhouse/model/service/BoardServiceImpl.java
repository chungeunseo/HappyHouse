package com.ssafy.happyhouse.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.model.BoardDTO;
import com.ssafy.happyhouse.model.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDTO> searchAll() throws SQLException {
		return boardMapper.searchAll();
	}

	@Override
	public List<BoardDTO> searchBySubject(String subject) throws SQLException {
		// TODO Auto-generated method stub
		return boardMapper.searchBySubject(subject);
	}

	@Override
	public List<BoardDTO> searchByUserId(String userId) throws SQLException {
		// TODO Auto-generated method stub
		return boardMapper.searchByUserId(userId);
	}

	@Override
	public List<BoardDTO> searchByContent(String content) throws SQLException {
		// TODO Auto-generated method stub
		return boardMapper.searchByContent(content);
	}

	@Override
	public boolean insert(BoardDTO boardDTO) throws SQLException {
		// TODO Auto-generated method stub
		return boardMapper.insert(boardDTO) == 1;
	}

	@Override
	public boolean delete(int articleno) throws SQLException {
		// TODO Auto-generated method stub
		return boardMapper.delete(articleno) == 1;
	}

	@Override
	public boolean update(BoardDTO boardDTO) throws SQLException {
		// TODO Auto-generated method stub
		return boardMapper.update(boardDTO) == 1;
	}

	@Override
	public List<BoardDTO> searchByArticleno(int articleno) throws SQLException {
		// TODO Auto-generated method stub
		return boardMapper.searchByArticleno(articleno);
	}
	
}
