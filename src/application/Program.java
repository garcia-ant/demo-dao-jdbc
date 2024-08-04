package application;

import java.util.Date;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department department = new Department(1,"Book");
		System.out.println(department);
		
		Seller seller = new Seller(19, "G.A", "ga@gmail.com", new Date(), 3000.00, department);
		SellerDao sellerdao = DaoFactory.creSellerDao();
		
		System.out.println(seller);
		
	}

}
