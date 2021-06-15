package com.edu.util;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 이 클래스는 이 프로젝트에서 공통으로 사용하는 유틸리티기능을 모아놓은 클래스. 
 * @author 조민재
 * 컨트롤러 기능 @Controller(jsp와 바인딩명시)
 * 콤포던트 @Component는 MVC가 아닌 기능들을 모아놓은 스프링빈 명시, 유틸 메서드 포함
 */
@Controller
public class CommonUtil {
	//RestAPI서버 맛보기ID중복체크(제대로 만들면 @RestController 사용)
	@RequestMapping(value="/id_check", method=RequestMethod.GET)
	@ResponseBody //반환 받은 값의 헤더 값을 제외하고, 내용(body)만 반환하겠다는 명시
	public String id_check() throws Exception {
		
		return "1";//0.jsp 이렇게 작동하지 않습니다. 이유는 @ResponseBody때문이고, RestAPI는 값만 반환
	}
}
