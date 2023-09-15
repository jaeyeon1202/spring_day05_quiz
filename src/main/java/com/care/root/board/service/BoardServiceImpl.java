package com.care.root.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.board.dto.BoardDTO;
import com.care.root.mybatis.board.BoardMapper;
@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardMapper bm;
	
	public ArrayList<BoardDTO> list(){
		ArrayList<BoardDTO> list = bm.list();
		return list;
	}
}
