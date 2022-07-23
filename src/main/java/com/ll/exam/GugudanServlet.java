package com.ll.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터를 UTF-8로 해석할것임
        resp.setCharacterEncoding("UTF-8"); // 완성되는 html의 인코딩을 UTF-8로 할것
        resp.setContentType("text/html; charset=utf-8");

        int num = Integer.parseInt(req.getParameter("num"));
        int limit = Integer.parseInt(req.getParameter("limit"));


        resp.getWriter().append("<h1>구구단은 %d단 입니다!</h1>".formatted(num));

        for (int i = 1; i <= limit; i++) {
            resp.getWriter().append("<div>%d * %d = %d</div>\n".formatted(num, i, num * i));
        }
    }
}
