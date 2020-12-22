package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemoListService;
import service.MemoRegService;
import service.MemoService;


@WebServlet("*.do")
public class MemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//다양한 서비스들
	private MemoService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println(uri);
		String[] strs = uri.split("/");
		String key = strs[strs.length-1];
		System.out.println(key);
		
		//서비스 선택
		if(key.equals("reg.do")) {
			service = new MemoRegService();
		}else if(key.equals("list.do")) {
			service = new MemoListService();
		}
		
		//서비스 실행후 페이지정보 리턴
		String path = null;
		if(service != null) {
			path = service.execute(request, response);
		}
		
		//리턴된 페이지로 이동
		if(path != null) {
			request.getRequestDispatcher(path).forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
