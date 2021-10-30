package maven.ejercicioServletsDos.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import maven.ejercicioServletsDos.model.Categoria;
import maven.ejercicioServletsDos.utils.HibernateUtil;

public class CategoriaDAO {
	static Logger logger = LogManager.getLogger(CategoriaDAO.class);
	
	public static List<Categoria> getCategorias(){
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		List<Categoria> listadoDeCategorias = CategoriaDAO.listadoDeCategorias(miSesion);
		
		return listadoDeCategorias;
	}
	
	public static List<Categoria> listadoDeCategorias(Session miSesion){
		Query<Categoria> consulta = miSesion.createQuery("from Categoria",Categoria.class);
		List<Categoria> listaCategorias = consulta.getResultList();
		
		return listaCategorias;
	}
	
	public static boolean insertarCatogoria(Session miSesion, String nombre, String descripcion) {
		boolean insertado = false;
		Transaction tx = miSesion.beginTransaction();
		try {
			Categoria nuevaCategoria = new Categoria(nombre, descripcion);
			miSesion.save(nuevaCategoria);
			tx.commit();
			insertado = true;
			logger.info("Categoria insertada correctamente en la BD");
		}catch(Exception e) {
			tx.rollback();
			logger.error("No se ha podido insertar la categoria en la BD "+e.getMessage());
		}
		miSesion.close();
		return insertado;
	}
}