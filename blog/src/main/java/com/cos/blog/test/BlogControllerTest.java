package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 //스프링이 com.cos.blog 이하를 스캔하여 특정 어노테이션이 붙어있는
//클래스 파일들을 new 해서 스프링 컨테이너에서 관리해줌
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() { 
		return "<h1>hello spring boot</h1>";
	}

}
