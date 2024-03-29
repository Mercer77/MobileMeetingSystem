package com.mercer.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @ Date:2019/3/24
 * Auther:Mercer
 * Auther:麻前程
 */
@WebServlet(urlPatterns = {"/"},loadOnStartup = 2)
public class WebPathInitServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        //在整体应用上下文当中储存了一个ctx的值，用它来引用上下文路径
        config.getServletContext().setAttribute("ctx",config.getServletContext().getContextPath());
        super.init(config);
    }
}
