package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repos.GroceryItemRepo;

@Service
public class GroceryItemService {

	@Autowired
	private GroceryItemRepo groceryItemRepo;
	
}
