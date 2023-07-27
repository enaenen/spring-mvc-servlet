package hello.servlet.projectx;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "projectxLoginServlet", urlPatterns = "/pjx/login")
public class ProjectxLoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("ProjectxLoginServlet.service");
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");
		String username = req.getParameter("user_id");

		HttpSession session = req.getSession();
		session.setAttribute("username", username);

		PrintWriter w = res.getWriter();
		w.write("<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>이노베이션아카데미 - 로그인완료</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"<div>\n" +
				username + " 로그인됨 \n" +
				"</div>\n" +
				"<div>\n" +
				"<a href=\"/pjx/logout\">로그아웃</a>" +
				"</div>\n" +
				"<div>\n" +
				"<a href=\"/pjx/main\">메인으로</a>" +
				"</div>\n" +
				"</body>\n" +
				"</html>\n");
	}
}
