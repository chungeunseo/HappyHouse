package com.ssafy.happyhouse.model.mapper;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.happyhouse.model.BoardDTO;
public interface BoardMapper {
	
	List<BoardDTO> searchAll() throws SQLException;
	List<BoardDTO> searchBySubject(String subject) throws SQLException;
	List<BoardDTO> searchByUserId(String userId) throws SQLException;
	List<BoardDTO> searchByContent(String content) throws SQLException;
	List<BoardDTO> searchByArticleno(int articleno) throws SQLException;
	int insert(BoardDTO boardDTO) throws SQLException;
	int delete(int articleno) throws SQLException;
	int update(BoardDTO boardDTO) throws SQLException;
	
}

