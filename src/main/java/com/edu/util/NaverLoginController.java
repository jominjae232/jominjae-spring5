package com.edu.util;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

//아래 sns.~만드는 목적: 로컬과 헤로쿠의 인증 ID와 Secret를 소스에서 변경하기보단, 전역변수로 만들면 편함.
@PropertySource("classpath:properties/sns.properties")
@Controller //스프링빈으로 등록되면, 인젝션으로 객체를 사용가능하게 됨.
public class NaverLoginController {
	
}
