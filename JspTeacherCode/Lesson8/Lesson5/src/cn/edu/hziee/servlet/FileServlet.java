package cn.edu.hziee.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FileServlet extends HttpServlet {
    private String email = null;
    @Override
    public void init() throws ServletException {
//        String param1 = this.getServletConfig().getInitParameter("param1");
//        System.out.println(param1);
        //访问上下文初始化参数，全局性质
        email = this.getServletContext().getInitParameter("email");
        System.out.println("FileServlet=="+email);
    }

    //不区分GET或POST，都会进入该方法
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(email);
    }
}
