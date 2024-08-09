package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@WebFilter("/servletFilter1")
public class Filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter start");
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        System.out.println( request.getHeader("country"));
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter end");
    }

    @Override
    public void destroy() {

    }
}
