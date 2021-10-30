package maven.ejercicioServletsDos.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import maven.ejercicioServletsDos.servlets.LoginServlet;

/**
 * Servlet Filter implementation class SesionFilter
 */
//@WebFilter("/*")
public class SessionFilter implements Filter {
	Logger logger = LogManager.getLogger(LoginServlet.class);
    /**
     * Default constructor. 
     */
    public SessionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session = req.getSession(false);
		String path = req.getRequestURI(); 
		
		if (session != null || path.endsWith("Login") || path.endsWith("/ejercicioServletsDos/vLogin.html")) {
			logger.info("ENTRÉ por FILTRO");
			chain.doFilter(request, response);
		} else {
			logger.info("SALÍ POR EL FILTRO");
			res.sendRedirect("/ejercicioServletsDos/vLogin.html");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
