package hello.servlet.projectx;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "projectxListServlet", urlPatterns = "/pjx/list")
public class ProjectxListServlet extends HttpServlet {


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");
		PrintWriter w = res.getWriter();
		w.write("<html>");
		w.write("<head>");
		w.write("    <meta charset=\"UTF-8\">");
		w.write("    <title>Title</title>");
		w.write("</head>");
		w.write("<body>");
		w.write("<a href=\"/projectx.html\">메인</a>");
		w.write("<table>");
		w.write("    <thead>");
		w.write("    <th>key</th>");
		w.write("    <th>value</th>");
		w.write("    </thead>");
		w.write("    <tbody>");
		for (Cookie product : cookies) {
			if(product.getName().contains("product")) {
				w.write("    <tr>");
				w.write("        <td>" + product.getName() + "</td>");
				w.write("        <td>" + product.getValue() + "</td>");
				w.write("    </tr>");
			}
		}
		w.write("    </tbody>");
		w.write("</table>");
		w.write("</body>");
		w.write("</html>");

	}
}
