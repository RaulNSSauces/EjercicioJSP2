package maven.ejercicioServletsDos.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import maven.ejercicioServletsDos.dao.UsuarioDAO;
import maven.ejercicioServletsDos.model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = LogManager.getLogger(LoginServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String user = request.getParameter("user");
		String passwd = request.getParameter("passwd");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("usr", user);
		
		if(UsuarioDAO.getUsuarioEmail(user, passwd)) {
			logger.info("Inicio de sesión correcto");
			
			//Almaceno el ID del ROL
			Usuario idRol = UsuarioDAO.getUsuarios(user, passwd);
            int id = idRol.getIdRol();
            System.out.println("desde servlet login "+ id) ;
            session.setAttribute("idRol", id);
            
			SimpleDateFormat formateo = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm");
			Date date = new Date(System.currentTimeMillis());
			session.setAttribute("hora", formateo.format(date));
			response.sendRedirect("jsp/vInicio.jsp");
		}else {
			logger.info("Inicio de sesión fallido");
			response.sendRedirect("vLogin.html");
		}
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}