package model_dao;

import java.util.List;

import model_entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteByID(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
