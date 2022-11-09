package cn.edu.hziee.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FileServlet extends HttpServlet {
    private  String email = null;
    private  String param1=null;
    @Override
    public void init() throws ServletException {
        System.out.println("init()...");
         param1 = this.getServletConfig().getInitParameter("param1");
        System.out.println("HelloServlet:"+param1);
        email =  this.getServletContext().getInitParameter("email");
        System.out.println("FileServlet:"+email);
    }

    /**
     * Service方法不区分GET-POST方式
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service()...");
        System.out.println(param1);
        PrintWriter out = response.getWriter();
        out.println(param1);
        System.out.println("service()...");
    }



    @Override
    public void destroy() {
        System.out.println("destory()...");
    }

    //    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       doPost(request,response);
//    }
}
