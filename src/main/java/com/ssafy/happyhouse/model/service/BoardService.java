package com.ssafy.happyhouse.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.happyhouse.model.BoardDTO;



public interface BoardService {
	List<BoardDTO> searchAll() throws SQLException;
	List<BoardDTO> searchBySubject(String subject) throws SQLException;
	List<BoardDTO> searchByUserId(String userId) throws SQLException;
	List<BoardDTO> searchByContent(String content) throws SQLException;
	List<BoardDTO> searchByArticleno(int articleno) throws SQLException;
	boolean insert(BoardDTO boardDTO) throws SQLException;
	boolean delete(int articleno) throws SQLException;
	boolean update(BoardDTO boardDTO) throws SQLException;
}
