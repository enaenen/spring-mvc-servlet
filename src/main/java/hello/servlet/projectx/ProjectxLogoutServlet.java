package hello.servlet.projectx;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "projectxLogoutServlet", urlPatterns = "/pjx/logout")
public class ProjectxLogoutServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("ProjectxLogoutServlet.service");
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");
		String username = req.getParameter("user_id");
		HttpSession session = req.getSession();
		session.invalidate();
		PrintWriter w = res.getWriter();
		res.sendRedirect("/pjx/main");
	}
}
