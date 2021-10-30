package maven.ejercicioServletsDos.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import maven.ejercicioServletsDos.model.Usuario;
import maven.ejercicioServletsDos.utils.HibernateUtil;

public class UsuarioDAO {
	
	static Logger logger = LogManager.getLogger(UsuarioDAO.class);
	
	public static boolean getUsuarioEmail(String email, String passwd) {
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		
		boolean existe = false;

		List<Usuario> listaUsuario = miSesion.createQuery("from Usuario", Usuario.class).getResultList();
		
		for (Usuario usuario : listaUsuario) {
			if(usuario.getEmail().equals(email) && usuario.getClave().equals(passwd)) {
				logger.info("El usuario existe en la BD");
				existe = true;
			}
		}
		logger.info("El usuario no existe en la BD");
		miSesion.close();
		return existe;
	}
	
	public static Usuario getUsuarios(String email, String passwd) {
		Session miSesion = HibernateUtil.getSessionFactory().openSession();

		List<Usuario> listaUsuario = miSesion.createQuery("from Usuario", Usuario.class).getResultList();
		
		Usuario u = listaUsuario.get(0);
		miSesion.close();
		
		return u;
	}
}