package com.care.root.mybatis.board;

import java.util.ArrayList;

import com.care.root.board.dto.BoardDTO;

public interface BoardMapper {
	
	public ArrayList<BoardDTO> list();
}
