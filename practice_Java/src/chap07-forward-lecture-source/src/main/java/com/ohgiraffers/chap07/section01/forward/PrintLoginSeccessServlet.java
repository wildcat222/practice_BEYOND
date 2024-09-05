package com.ohgiraffers.chap07.section01.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSeccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // forward 된 서블릿에서도 요청 방식이 그대로 유지된다. (post -> post)
        // 전달 된 req, resp 의 모든 정보를 이용해 새로운 req, resp 를 깊은 복사를 통해 만들어 전달하므로
        // 데이터가 그대로 유지되고 있다.

        // parameter = 클라이언트에서 전송 된 데이터
        // attribute : request 객체가 가지는 속성으로 request가 유지되는 동안 데이터가 보존
        String userName = (String) req.getAttribute("userName");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + userName + "님 환영합니다.</h1>");
        out.flush();
        out.close();

        // forward 방식 : 다른 서블릿으로 위임하면서 데이터 공유(req를 통해)가 가능하다.
        // 클라이언트는 forward 사실을 알 필요가 없으므로 요청 url은 변경되지 않는다.
        // 새로고침(=재요청) 시 동일 요청을 반복하게 되는데 이 때 DB에 insert 등의 행위가 있으면
        // 중복 행 상ㅂ입이 되는 문제가 생긴다. -> 이런 경우는 rediret 방식 응답을 해야한다.


    }
}
