package com.ssafy.happyhouse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.model.BoardDTO;
import com.ssafy.happyhouse.model.service.BoardService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/board")
@CrossOrigin(origins = "*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private BoardService boardService;

    @ApiOperation(value = "모든 게시글의 정보를 반환한다.")
	@GetMapping
	public ResponseEntity<List<BoardDTO>> searchAll() throws Exception {
		logger.debug("retrieveBoard - 호출");
		return new ResponseEntity<List<BoardDTO>>(boardService.searchAll(), HttpStatus.OK);
	}

    @ApiOperation(value = "제목을 포함하는 게시글의 정보를 반환한다.", response = BoardDTO.class)    
	@GetMapping("subject/{subject}")
	public ResponseEntity<List<BoardDTO>> searchBySubject(@PathVariable String subject) throws Exception {
		logger.debug("detailBoard - 호출");
		return new ResponseEntity<List<BoardDTO>>(boardService.searchBySubject(subject), HttpStatus.OK);
	}
    
    @ApiOperation(value = "해당 번호의 게시글 정보를 반환한다.", response = BoardDTO.class)    
    @GetMapping("{articleno}")
    public ResponseEntity<List<BoardDTO>> searchByArticleno(@PathVariable int articleno) throws Exception {
    	logger.debug("detailBoard - 호출");
    	return new ResponseEntity<List<BoardDTO>>(boardService.searchByArticleno(articleno), HttpStatus.OK);
    }
    
    @ApiOperation(value = "내용을 포함하는 게시글의 정보를 반환한다.", response = BoardDTO.class)    
    @GetMapping("content/{content}")
    public ResponseEntity<List<BoardDTO>> searchByContent(@PathVariable String content) throws Exception {
    	logger.debug("detailBoard - 호출");
    	return new ResponseEntity<List<BoardDTO>>(boardService.searchByContent(content), HttpStatus.OK);
    }
    
    @ApiOperation(value = "사용자에 해당하는 게시글의 정보를 반환한다.", response = BoardDTO.class)    
    @GetMapping("userId/{userId}")
    public ResponseEntity<List<BoardDTO>> searchByUserId(@PathVariable String userId) throws Exception {
    	logger.debug("detailBoard - 호출");
    	return new ResponseEntity<List<BoardDTO>>(boardService.searchByUserId(userId), HttpStatus.OK);
    }
    

    @ApiOperation(value = "새로운 게시글 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody BoardDTO boardDTO) throws Exception {
		logger.debug("writeBoard - 호출");
		if (boardService.insert(boardDTO)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

    @ApiOperation(value = "글번호에 해당하는 게시글의 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("{articleNo}")
	public ResponseEntity<String> updateBoard(@RequestBody BoardDTO boardDTO, @PathVariable int articleNo) throws Exception {
		
    	boardDTO.setArticleno(articleNo);
    	logger.debug("updateBoard - 호출");
		logger.debug("" + boardDTO);
		
		if (boardService.update(boardDTO)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

    @ApiOperation(value = "글번호에 해당하는 게시글의 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("{articlNo}")
	public ResponseEntity<String> deleteBoard(@PathVariable int articlNo) throws Exception {
		logger.debug("deleteBoard - 호출");
		if (boardService.delete(articlNo)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
}
