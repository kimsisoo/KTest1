package org.zerock.service;

import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j


public class BoardServiceTests {

	@Autowired
	private BoardService service;
	
	//목록보기
	@Test
	public void testExit() {
		log.info(service);
	}
	//글등록
	@Test
	public void register(BoardVO vo) {
		BoardVO board = new BoardVO();
		vo.setTitle("새로작성한글");
		vo.setContent("새로작성한내용");
		vo.setWriter("newbie");
		
		service.register(vo);
		log.info("생성된 게시물의 번호: "+ vo.getBno());
	}
	//글삭제

	//글수정
	//글상세보기
	
}
