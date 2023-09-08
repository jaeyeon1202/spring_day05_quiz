package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dto.memberDTO;
import com.care.root.mybatis.member.memberMapper;

@Service
public class memberServiceImpl implements memberService {
	
	@Autowired memberMapper dao;
	
	public memberDTO loginChk(String id) {
		memberDTO dto = dao.loginChk(id);
		return dto;
	}
	
	public ArrayList<memberDTO> list(){
		ArrayList<memberDTO> list = dao.list();
		return list;
	}
	
	public memberDTO memberInfo(String id) {
		memberDTO dto = dao.memberInfo(id);
		return dto;
	}
	
	public int registerChk(memberDTO dto) {
		int result = 0;
		result = dao.registerChk(dto);
		System.out.println("ser");
		return result;
	}
}
