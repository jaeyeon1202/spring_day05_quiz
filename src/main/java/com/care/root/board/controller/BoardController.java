package com.care.root.board.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.root.board.dto.BoardDTO;
import com.care.root.board.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired BoardService service;
	
	@GetMapping("boardList")
	public String list(Model model) {
		System.out.println("list 실행");
		ArrayList<BoardDTO> list = service.list();
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	@GetMapping("writeForm")
	public String writeForm(Model model, HttpSession session) {
		System.out.println("writeform");
		model.addAttribute("session", session.getAttribute("session"));
		return "board/writeForm";
	}
	
	@PostMapping("writeSave")
	public String writeSave(@RequestParam String id) {
		System.out.println("writeSave 실행");
		System.out.println("id   "+id);
		return "redirect:boardList";
	}
}
