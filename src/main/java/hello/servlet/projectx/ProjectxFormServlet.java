package hello.servlet.projectx;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProjectxFormServlet", urlPatterns = "/pjx/form")
public class ProjectxFormServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		PrintWriter w = response.getWriter();
		w.write("<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>Title</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"<form action=\"/pjx/save\" method=\"post\">\n" +
				"    product name: <input type=\"text\" name=\"name\" />\n" +
				" <button type=\"submit\">전송</button>\n" + "</form>\n" +
				"</form>\n" +
				"</body>\n" +
				"</html>\n");
	}

}
