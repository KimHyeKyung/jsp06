package service; //어떤 로직을 처리하는 서비스를 제공 -> 인터페이스

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MemoService {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ;
	
}
