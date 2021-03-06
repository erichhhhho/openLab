package com.lab.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Project：${project_name}
 * @File：${type_name}
 * @Author：何唯 （Erichhhhho）
 * @Date：20:22 2017/6/29
 * @Description：
 */
@WebServlet(name = "TestServlet",value = "/TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        PrintWriter out=response.getWriter();

        String birthday ="2017-02-22";

        SimpleDateFormat sdf = new SimpleDateFormat(("yyyy-MM-dd"));
        java.util.Date date = null;
        try {
            date = sdf.parse(request.getParameter("day"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(new java.sql.Date(date.getTime()));
        out.print(new java.sql.Date(date.getTime()));


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
