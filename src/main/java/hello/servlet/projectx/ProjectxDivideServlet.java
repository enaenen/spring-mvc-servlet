package hello.servlet.projectx;

import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "projectxDivideServlet", urlPatterns = "/pjx/divide")
public class ProjectxDivideServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("ProjectxDivideServlet.service");
		try {
			Double x = Double.valueOf(req.getParameter("x"));
			Double y = Double.valueOf(req.getParameter("y"));
			Double result = x / y;

			req.setAttribute("result", result);
			String viewPath = "/projectx/divide-result.jsp";
			RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
			dispatcher.forward(req,
					res);// dispatcher.forward() 서버 내부에서 다시 호출 발생 ( 클라이언트로 갔다가 오지 않음 )
		} catch (Exception e) {
			res.sendRedirect("/projectx/pjx-error.jsp");
		}
	}
}
