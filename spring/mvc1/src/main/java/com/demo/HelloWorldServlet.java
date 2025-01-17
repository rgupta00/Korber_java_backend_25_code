//package com.demo;
//
//import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class HelloWorldServlet extends HttpServlet {
//
//    public HelloWorldServlet(){
//        System.out.println("ctr");
//    }
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        System.out.println("init");
//        super.init(config);
//    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("service method ");
//        PrintWriter out=resp.getWriter();
//        out.println("hello all champs!");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destory");
//        super.destroy();
//    }
//
//
//
//
//}
