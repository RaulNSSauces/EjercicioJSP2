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

import maven.ejercicioServletsDos.dao.CategoriaDAO;
import maven.ejercicioServletsDos.utils.HibernateUtil;

/**
 * Servlet implementation class AltaCategoria
 */
@WebServlet("/AltaCategoria")
public class AltaCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = LogManager.getLogger(AltaCategoria.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomCategoria = request.getParameter("nomCategoria");
		String descCategoria = request.getParameter("descCategoria");
		
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		PrintWriter out = response.getWriter();
		
		if(CategoriaDAO.insertarCatogoria(miSesion, nomCategoria, descCategoria)) {
			response.sendRedirect("jsp/vMostrarListadoCategoria.jsp");
			logger.info("Categoria insertada correctamente en la BD");
		}else {
			out.println("<h1>No se ha podido crear la categoria correctamente</h1>");
			logger.info("La categoría no se ha podido insertar en la BD");
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
