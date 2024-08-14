package application;

import java.util.Date;
import java.util.List;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.creSellerDao();
		System.out.println("=========== TEST 1: seller findById =======");
		Seller seller = sellerdao.findById(2);

		System.out.println(seller);

		System.out.println("\n=========== TEST 2: seller findByDepartment =======");
		Department department = new Department(3, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for(Seller dp : list) {
			System.out.println(dp);
		}
		
		System.out.println("\n=========== TEST 3: seller findByAll =======");
		list = sellerdao.findAll();
		for(Seller dp : list) {
			System.out.println(dp);
		}
		
		System.out.println("\n=========== TEST 4: seller Seller Insert =======");
		Seller newSeller = new Seller(null, "Gpy", "gpy@gmail.com", new Date(), 10000.0, department);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! new id =" + newSeller.getId());
		
		System.out.println("\n=========== TEST 5: seller Seller Update =======");
		seller = sellerdao.findById(1);
		seller.setName("MAyra");
		seller.setEmail("mayra@gmail.com");
		sellerdao.update(seller);
		System.out.println("Update completed !");
	
	}

}
