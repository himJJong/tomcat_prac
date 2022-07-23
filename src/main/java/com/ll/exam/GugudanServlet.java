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


        Rq rq = new Rq(req, resp);

        int num = rq.getIntParam("num",0);
        int limit = rq.getIntParam("limit",0);


        rq.appendBody("<h1>구구단은 %d단 입니다!</h1>".formatted(num));

        for (int i = 1; i <= limit; i++) {
            rq.appendBody("<div>%d * %d = %d</div>\n".formatted(num, i, num * i));
        }
    }
}
