package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemoDAO;
import dto.MemoDTO;

public class MemoListService implements MemoService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//목적: 서버에 있는 모든 데이터를 가져오기
		MemoDAO dao = new MemoDAO();
		
		List<MemoDTO> list = dao.selectAll();
		request.setAttribute("list", list);
		return "list.jsp";
	}

}
