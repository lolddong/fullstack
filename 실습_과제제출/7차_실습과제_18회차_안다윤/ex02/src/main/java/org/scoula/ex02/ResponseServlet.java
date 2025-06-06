package org.scoula.ex02;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseServlet", value="/response")
public class ResponseServlet {
    private String message;

    public void init() {
        message = "ResponseServlet 요청 성공";
        System.out.println("init() 초기화 호출됨");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + message + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println("destroy() 소멸 호출됨");
    }
}
