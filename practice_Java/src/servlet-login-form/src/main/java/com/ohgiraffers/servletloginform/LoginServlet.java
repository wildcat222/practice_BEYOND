package com.ohgiraffers.servletloginform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();

        StringBuilder login = new StringBuilder();
        login.append("<html>")
                .append("<head>")
                .append("<title>만년설 login</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>Login Form</h1>")
                .append("<form action=\"/login\" method=\"post\">")
                .append("<label>이름 : </label><input type=\"text\" name=\"name\">")
                .append("<br>")
                .append("<label>P/W : </label><input type=\"text\" name=\"password\">")
                .append("<br>")
                .append("<input type=\"submit\" value=\"로그인\">")
                .append("</form>")
                .append("</body>")
                .append("</html>");

        out.print(login);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = "김태영";
        String pw = "1234";
        req.setCharacterEncoding("UTF-8");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        String userName = req.getParameter("name");
        String password = req.getParameter("password");

        if(userName.equals(user) && password.equals(pw)) {
            PrintWriter writer = resp.getWriter();
            StringBuilder success = new StringBuilder();
            success.append("<html>")
                    .append("<head>")
                    .append("<title>❄\uFE0F만년설❄\uFE0F</title>")
                    .append("</head>")
                    .append("<body>")
                    .append("<h1>❄\uFE0F만년설❄\uFE0F로 출발합니다!</h1>")
                    .append("</body>")
                    .append("</html>");

            writer.print(success);
            writer.flush();
            writer.close();
        } else {
            PrintWriter writer = resp.getWriter();
            StringBuilder fail = new StringBuilder();
            fail.append("<html>")
                    .append("<head>")
                    .append("<title>❄\uFE0F만년설❄\uFE0F login</title>")
                    .append("</head>")
                    .append("<body>")
                    .append("<h1>로그인에 실패하였습니다.</h1>")
                    .append("<h1>이름과 패스워드가 맞는지 확인해주세요.</h1>")
                    .append("<form action=\"/login\" method=\"post\">")
                    .append("<label>이름 : </label><input type=\"text\" name=\"name\">")
                    .append("<br>")
                    .append("<label>P/W : </label><input type=\"text\" name=\"password\">")
                    .append("<br>")
                    .append("<input type=\"submit\" value=\"로그인\">")
                    .append("</form>")
                    .append("</body>")
                    .append("</html>");

            writer.print(fail);
            writer.flush();
            writer.close();
        }
    }
}
