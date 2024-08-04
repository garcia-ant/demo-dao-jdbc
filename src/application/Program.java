package application;

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
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for(Seller dp : list) {
			System.out.println(dp);
		}
		
		

	}

}
