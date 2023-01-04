package com.kh.test.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "TestServlet", urlPatterns = "test.do")
public class TestController extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        
        String phone = request.getParameter("phone");
        String address1 = request.getParameter("address");
    }
}