package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//폼 전송되는 내용을 콘솔에 출력하고
		String id=request.getParameter("id");
		System.out.println("id:"+id);
		String pwd=request.getParameter("pwd");
		System.out.println("pwd:"+pwd);
		//클라이언트에게는 login ok라고 출력
		PrintWriter pw=response.getWriter();
		//아이디 비밀번호가 gura, 1234 라고 가정하면 
		if(id.equals("gura") && pwd.equals("1234")) {
			pw.print("login ok~");
		}else {
			pw.println("login fail~");	
		}
		pw.println("login ok");
		
	}
}
