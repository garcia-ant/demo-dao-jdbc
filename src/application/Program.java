package application;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.creSellerDao();
		Seller seller = sellerdao.findById(3);

		System.out.println(seller);

	}

}
