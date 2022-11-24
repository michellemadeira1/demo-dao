package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	
	void update (Seller obj);
	void deletById (Integer obj);
	
	Seller findById(Integer id);
	
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	void insert(Seller obj);
}
