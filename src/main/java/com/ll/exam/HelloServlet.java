package com.ll.exam;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터를 UTF-8로 해석할것임
        resp.setCharacterEncoding("UTF-8"); // 완성되는 html의 인코딩을 UTF-8로 할것
        resp.setContentType("text/html; charset=utf-8");

        resp.getWriter().append("hello tomcat");

    }
}
