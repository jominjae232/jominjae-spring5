package com.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.vo.BoardTypeVO;

/**
 * 이 클래스는 게시판생성관리 쿼리의 인터페이스를 구현 메서드가 있는 클래스입니다.
 * @author 조민재
 *
 */
@Repository
public class BoardTypeDAOImpl implements IF_BoardTypeDAO {
	//slqSession템플릿 의존성을 주입
	@Inject //자바8부터 신규로 나온 애노테이션입니다.
	private SqlSession sqlSession;
	
	@Override
	public void deleteBoardType(String board_type) throws Exception {
		// TODO sqlSession템플릿(틀)을 이용해서 매쿼리리를 실행
		sqlSession.delete("boardTypeMapper", board_type);
	}

	@Override
	public void updateBoardType(BoardTypeVO boardTypeVO) throws Exception {
		// TODO 아래 주석 동일
		sqlSession.update("boardTypeMapper.updateBoardType", boardTypeVO);
	}

	@Override
	public BoardTypeVO readBoardType(String board_type) throws Exception {
		// TODO 아래 주석 동일
		return sqlSession.selectOne("boardTypeMapper.readBoardType", board_type);
	}

	@Override
	public void insertBoardType(BoardTypeVO boardTypeVO) throws Exception {
		// TODO 아래 주석 동일
		sqlSession.insert("boardTypeMapper.insertBoardType", boardTypeVO);
		
	}

	@Override
	public List<BoardTypeVO> selectBoardType() throws Exception {
		// TODO 메퍼쿼리를 실행 sqlSession템플릿(틀)을 이용해서 실행
		return sqlSession.selectList("boardTypeMapper.selectBoardType");
	}

}
