package com.cos.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.blog.config.auth.PrincipalDetail;
import com.cos.blog.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	 
	@GetMapping({"","/"})
	public String index(Model model) {
		model.addAttribute("boards", boardService.글목록());
		return "index"; //viewResolver 작동 : 페이지 이동하며 모델 같이보냄
	}
	
	@GetMapping({"board/saveForm"})
	public String saveForm() {
		// /WEB-INF/views/index.jsp
		return "board/saveForm";
	}
}
