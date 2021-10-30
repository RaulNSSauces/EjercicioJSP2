package maven.ejercicioServletsDos.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Servlet implementation class CloseSession
 */
@WebServlet("/CloseSession")
public class CloseSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = LogManager.getLogger(LoginServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CloseSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
			logger.info("ENTRO");
			response.sendRedirect("vLogin.html");
		}
	}

}
