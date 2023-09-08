package com.care.root.member.service;

import java.util.ArrayList;

import com.care.root.member.dto.memberDTO;

public interface memberService {
	
	public memberDTO loginChk(String id);
	public ArrayList<memberDTO> list();
	public memberDTO memberInfo(String id);
	public int registerChk(memberDTO dto);
}
