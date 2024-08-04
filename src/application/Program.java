package application;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.creSellerDao();
		System.out.println("=========== TEST 1: seller findById =======");
		Seller seller = sellerdao.findById(2);

		System.out.println(seller);

	}

}
