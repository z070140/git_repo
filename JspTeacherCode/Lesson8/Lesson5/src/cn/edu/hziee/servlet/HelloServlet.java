package cn.edu.hziee.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init()...");

        //试图访问其他Servlet中的初始化参数，失败！！！
//        String param1 = this.getServletConfig().getInitParameter("param1");
//        System.out.println("HelloServlet："+param1);
        //访问上下文初始化参数，全局性质
        String email = this.getServletContext().getInitParameter("email");
        System.out.println("FileServlet=="+email);
    }

    /**
     * service方法不区分GET、POST请求方式
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service()...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()...");
    }
}
