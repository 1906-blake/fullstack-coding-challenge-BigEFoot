package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.GroceryItem;
import com.revature.models.GroceryList;
import com.revature.services.GroceryItemService;
import com.revature.services.GroceryListService;

@RestController
@RequestMapping("item")
public class GroceryItemController {

	@Autowired
	private GroceryItemService grocerytemService;
//	@PostMapping("{listId}/item")
//	public GroceryItem addItemToList(@PathVariable int listId, @RequestBody GroceryItem item) {
//		return groceryItemService.addItemToList(listId, item);
//	}
//	
}
