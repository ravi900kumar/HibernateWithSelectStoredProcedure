package java9r.dao.com;
import java9r.entites.com.*;
import java9r.util.com.*;
import java.util.*;
import org.hibernate.*;

public class ProductDAO {
 private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
 @SuppressWarnings("unchecked")

 public List<Product> FindAllProducts(){
	 try {		
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			SQLQuery sqlq = sessionFactory.getCurrentSession()
					.createSQLQuery("call getproducts()");
		return sqlq.addEntity(Product.class).list();
			
		} catch (Exception e) {
			return null;
		}
 }
}