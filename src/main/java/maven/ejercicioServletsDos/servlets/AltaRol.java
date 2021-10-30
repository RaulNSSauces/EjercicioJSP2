package maven.ejercicioServletsDos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import maven.ejercicioServletsDos.dao.RolDAO;
import maven.ejercicioServletsDos.utils.HibernateUtil;

/**
 * Servlet implementation class AltaRol
 */
@WebServlet("/AltaRol")
public class AltaRol extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = LogManager.getLogger(AltaRol.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaRol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombreRol = request.getParameter("nombreRol");
		
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		PrintWriter out = response.getWriter();
		if(RolDAO.insertarRol(miSesion, nombreRol)) {
			response.sendRedirect("jsp/vMostrarListado.jsp");
			logger.info("ROL insertado correctamente en la BD");
		}else {
			out.println("<h1>No se ha podido crear el rol correctamente</h1>");
			logger.info("El ROL no se ha podido insertar en la BD");
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
