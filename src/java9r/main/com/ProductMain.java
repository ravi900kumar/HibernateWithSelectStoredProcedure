package java9r.main.com;
import java.util.List;
import java9r.dao.com.*;
import java9r.entites.com.*;
public class ProductMain {
 public static void main(String[] args) {
  ProductDAO product=new ProductDAO();
  List<Product> liProducts=product.FindAllProducts();
   for (Product p : liProducts){
   System.out.println("Id " + p.getId());
   System.out.println("Name " + p.getName());
   System.out.println("Price  " + p.getPrice());
   System.out.println("Description  " + p.getDescription());
   System.out.println("Status  " + p.getActive());
   System.out.println("---------------");
  }
 }

}
