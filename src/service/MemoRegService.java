package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemoDAO;
import dto.MemoDTO;

public class MemoRegService implements MemoService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 웹에서 넘어온 정보확인
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		MemoDTO dto = new MemoDTO();
		dto.setWriter(writer);
		dto.setContent(content);
		
		//2. DB에 저장 -> DAO
		MemoDAO dao = new MemoDAO(); //생성자는 항상new로 호출해야한다!!!
		dao.insert(dto);
		
		//3. 이동할 주소
		return "reg.jsp";
	}

}
