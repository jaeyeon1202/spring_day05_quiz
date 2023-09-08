package com.care.root.member.controller;

import java.util.ArrayList;

import javax.annotation.processing.Generated;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.root.member.dto.memberDTO;
import com.care.root.member.service.memberService;

@Controller
@RequestMapping("member")
public class memberController {
	
	@Autowired memberService service;
	
	@GetMapping("index")
	public String index() {
		System.out.println("index ����");
		return "index";
	}
	
	@GetMapping("login")
	public String login() {
		System.out.println("login ����");
		return "member/login";
	}
	
	@PostMapping("loginChk")
	public String lohinChk(@RequestParam String id,@RequestParam String pw, HttpSession session) {
		System.out.println("loginChk ����");
		memberDTO dto = service.loginChk(id);
		if(dto != null) {
			if(pw.equals(dto.getPw())) {
				session.setAttribute("session", id);
				return "member/loginChk";
			}else {
				return "redirect:login";
			}
		}
		return "redirect:login";
	}
	
	@GetMapping("successLogin")
	public String successLogin() {
		System.out.println("successLogin ����");
		return "member/successLogin";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		System.out.println("logout ����");
		session.invalidate();
		return "member/logout";
	}
	
	@GetMapping("list")
	public String list(HttpSession session, Model model) {
		System.out.println("list ����");
		if(session == null) {
			return "member/login";
		}
		ArrayList<memberDTO> list = service.list();
		model.addAttribute("list", list);
		return "member/list";
	}
	
	@GetMapping("memberInfo")
	public String memberInfo(@RequestParam String id, Model model) {
		System.out.println("memberInfo ����");
		memberDTO dto = service.memberInfo(id);
		model.addAttribute("dto", dto);
		return "member/memberInfo";
	}
	
	@GetMapping("register")
	public String register() {
		System.out.println("reigster ����");
		return "member/register";
	}
	
	@PostMapping("registerChk")
	public String registerChk(memberDTO dto, Model model) {
		System.out.println("registerChk ����");
		int result = 0;
		result = service.registerChk(dto);
		model.addAttribute("result", result);
		return "member/registerChk";
	}
}
