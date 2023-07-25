package hello.servlet.projectx;

import hello.servlet.projectx.repository.SequenceNumberUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "pjxRequest", urlPatterns = "/pjx/save")
public class ProjectxSaveServlet extends HttpServlet {


	@Override
	protected void service(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("name");
		response.addCookie(new Cookie("product"+ SequenceNumberUtil.sequence++, productName));

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
				"<div>\n" +
				productName + " 저장됨 \n" +
				"</div>\n" +
				"<div>\n" +
				"<a href=\"/projectx.html\">메인</a>"  +
				"</div>\n" +
				"<div>\n" +
				"<a href=\"/pjx/list\">리스트</a>"  +
				"</div>\n" +
				"<div>\n" +
				"<a href=\"/pjx/form\">저장폼</a>"  +
				"</div>\n" +
				"</body>\n" +
				"</html>\n");
	}

}
