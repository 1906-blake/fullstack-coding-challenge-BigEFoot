package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.GroceryList;

public interface GroceryListRepo extends JpaRepository<GroceryList, Integer> {
	

}
