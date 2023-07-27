package hello.servlet.projectx;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "projectxMainServlet", urlPatterns = "/pjx/main")
public class ProjectxMainServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("ProjectxLogoutServlet.service");
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");

		HttpSession session = req.getSession();
		String username = (String) session.getAttribute("username");

		PrintWriter w = res.getWriter();
		w.write("<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>이노베이션아카데미 - 메인화면</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"<div>\n" +
				username + "\n" +
				"</div>\n" +
				"<div>\n" +
				"<a href=\"/projectx/pjx-login.html\">로그인창</a>" +
				"</div>\n" +
				"</div>\n" +
				"<div>\n" +
				"<a href=\"/pjx/logout\">로그아웃</a>" +
				"</div>\n" +
				"</body>\n" +
				"</html>\n");
	}
}
