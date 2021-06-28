package com.edu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.service.IF_ReplyService;

/**
 * 이 클래스는 RestFull 서비스의 Endpoint(게이트웨이, URL맵핑)를 만드는 클래스입니다.
 * 간단하게 말하면, RestAPI서버 만드는 클래스 입니다.
 * @author 조민재
 *
 */
@RestController
public class ReplyController {
	@Inject
	private IF_ReplyService replyService;
	
	@RequestMapping(value="/reply/reply_list/{bno}/{page}", method=RequestMethod.POST)
	public ResponseEntity<Map<String,Object>> reply_list() {
		//ResponseEntity는 일반 Controller클래스에서 사용했던 ReponseBody와 같은 역할
		//URL주소가 아니고, Json데이터형으로 자료를 반환
		Map<String,Object> dummyMap1 = new HashMap<String,Object>();
		Map<String,Object> dummyMap2 = new HashMap<String,Object>();
		Map<String,Object> dummyMap3 = new HashMap<String,Object>();
		dummyMap1.put("rno", 1);
		dummyMap1.put("reply_text", "댓글테스트1");
		dummyMap1.put("reply","admin");
		dummyMap1.put("bno","59");
		
		dummyMap2.put("rno", 2);
		dummyMap2.put("reply_text", "댓글테스트2");
		dummyMap2.put("reply","admin");
		dummyMap2.put("bno","59");
		
		dummyMap3.put("rno", 3);
		dummyMap3.put("reply_text", "댓글테스트3");
		dummyMap3.put("reply","admin");
		dummyMap3.put("bno","59");
		//위 Map형 레코드 3개를 1개의 List객체로 묶었습니다.(아래)
		List<Object> dummyMapList = new ArrayList<Object>();
		dummyMapList.add(0,dummyMap1);
		dummyMapList.add(1,dummyMap2);
		dummyMapList.add(2,dummyMap3);
		//------------------------------------
		//아래 resultMap을 만든 목적은: 위 List객체를 ResponseEntity객체의 매개변수로 사용
		Map<String,Object> resultMap = new HashMap<String,Object>();
		//아래의 Json데이터형태는 일반 컨트롤러에서 사용했던 model사용해서 ("변수명",객체내용) 전송한 방식과 동일
		resultMap.put("replyList", dummyMapList);
		//객체를 2개 이상 보내게 되는 상활일때, Json데이터 형태(key:value)로 만들어서 보냅니다.
		//-------------------------------------
		ResponseEntity<Map<String,Object>> result = null;
		//result 객체를 만든 목적: RestApi클라이언트(jsp쪽)으로 resultMap객체를 보낼때 상태값을 보내기 위해서
		result = new ResponseEntity<Map<String,Object>>(resultMap,HttpStatus.OK);
		return result;
		/* Json데이터 예 
		resultMap = 
		[ //ResponseEntity형태는 대괄호로 자료를 묶어서[배열로] 반환합니다.
		 {"rno":"1","reply_text":"댓글 테스트1","reply":"admin","bno":59}, <= Map<String,Object>1개 레코드
		 {"rno":"2","reply_text":"댓글 테스트2","reply":"admin","bno":59},
		 {"rno":"3","reply_text":"댓글 테스트3","reply":"admin","bno":59},
		];
		*/
		
	}
}
