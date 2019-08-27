package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.GroceryList;
import com.revature.services.GroceryListService;

@RestController
@RequestMapping("list")
public class GroceryListController {
	@Autowired
	private GroceryListService groceryListService;

	@GetMapping
	public List<GroceryList> findAll() {
		return groceryListService.findAll();
	}

	@PostMapping
	@ResponseBody
	public GroceryList newList(@RequestBody GroceryList list) {
		return groceryListService.newList(list);
	}
	
	@DeleteMapping(value = "/{listId}")
	public GroceryListService deleteList(@PathVariable int id) {
		return groceryListService;
	}
	
}
//POST /grocery-lists/items to add a new item to a grocery list