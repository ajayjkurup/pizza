package com.seqato.pizza.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seqato.pizza.model.Store;
import com.seqato.pizza.service.StoreService;

@Controller
@RequestMapping("/")
public class StoreController {
	@Autowired
	StoreService service;
	//view store
	@RequestMapping(value = { "/", "/storelist" }, method = RequestMethod.GET)
	public String listStore(ModelMap model) {

		List<Store> store = service.findStore();
		int val =store.size();
		System.out.println("value of "+val);
		model.addAttribute("store", store);
		return "Store";
	}
	
	//Add store
	
	@RequestMapping(value = { "/newstore" }, method = RequestMethod.GET)
	public String newEmployee(ModelMap model) {
		Store store = new Store();
		model.addAttribute("store", store);
		model.addAttribute("edit", false);
		return "Addstore";
	}
	
	@RequestMapping(value={"/newstore"} , method = RequestMethod.POST)
	public String data(@Valid Store store, BindingResult result,
			ModelMap model){

		service.saveStore(store);
		
		return "redirect:/storelist";
	}
	
	//Delete store
	
	@RequestMapping(value = { "/delete-{id}-store" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable int id) {
		service.deleteStoreById(id);
		return "redirect:/storelist";
	}
	//edit store
	
	@RequestMapping(value = { "/edit-{id}-store" }, method = RequestMethod.GET)
	public String editEmployee(@PathVariable int id, ModelMap model) {
		Store store = service.findByStoreId(id);
		model.addAttribute("store", store);
		model.addAttribute("edit", true);
		return "Addstore";
	}
	
	@RequestMapping(value = { "/edit-{id}-store" }, method = RequestMethod.POST)
	public String updateStore(@Valid Store store,ModelMap model, @PathVariable int id) {

		service.updateStore(store);

		//model.addAttribute("success", "Employee " + employee.getName()	+ " updated successfully");
		return "redirect:/storelist";
	}

}
