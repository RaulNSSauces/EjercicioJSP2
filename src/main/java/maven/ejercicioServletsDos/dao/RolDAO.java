package maven.ejercicioServletsDos.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import maven.ejercicioServletsDos.model.Rol;
import maven.ejercicioServletsDos.utils.HibernateUtil;

public class RolDAO {
	static Logger logger = LogManager.getLogger(RolDAO.class);
	
	//Este es el que llamo desde el JSP
	public static List<Rol> getRoles(){
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		List<Rol> listadoDeRoles = RolDAO.listadoDeRoles(miSesion);
		return listadoDeRoles;
	}
	
	public static List<Rol> listadoDeRoles(Session miSesion){
		Query<Rol> consulta = miSesion.createQuery("from Rol",Rol.class);
		
		List<Rol> listaRoles = consulta.getResultList();
		
		return listaRoles;
	}

	public static boolean insertarRol(Session miSesion, String nombre) {
		boolean insertado = false;
		Transaction tx = miSesion.beginTransaction();
		try {
			Rol nuevoRol = new Rol (nombre);
			miSesion.save(nuevoRol);
			tx.commit();
			insertado = true;
			logger.info("Rol insertado correctamente en la BD");
		}catch(Exception e) {
			tx.rollback();
			logger.error("No se ha podido insertar el ROL en la BD "+e.getMessage());
		}
		miSesion.close();
		return insertado;
	}
}
