package net.pet.shoppinghubbackend.dao;

import java.util.List;

import net.pet.shoppinghubbackend.dto.Category;

public interface CategoryDao {
	
	List<Category> list();
	Category get(int id);
	

}
