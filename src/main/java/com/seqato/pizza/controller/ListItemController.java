package com.seqato.pizza.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.seqato.pizza.model.Item;
import com.seqato.pizza.service.ListService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ListItemController {
	@Autowired
	ListService service;
	
	private static final Logger logger = LoggerFactory.getLogger(ListItemController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/additem", method = RequestMethod.GET)
	public String name() {
		return "additem";
	}
	@RequestMapping(value = "/additem", method = RequestMethod.POST)
	public String addItem(@ModelAttribute("item") Item item) {
		service.addItem(item);
		System.out.println(item.getName());
	
		return "redirect:/viewitems";		
	}
	@RequestMapping(value = "/viewitems", method = RequestMethod.GET)
	public String viewItems(Model model){
		
		List<Item> items=service.findAllItems();
		model.addAttribute("items",items);
		return "viewitems";
	}
	@RequestMapping(value = { "/edit-{id}-item" }, method = RequestMethod.GET)
	public String editItem(@PathVariable int id, ModelMap model) {
		Item item = service.findItembyId(id);
		model.addAttribute("item", item);
		model.addAttribute("id",id);
		System.out.println(item.getDescription());
		return "edit";
	}
	@RequestMapping(value = { "/edit-{id}-item" }, method = RequestMethod.POST)
	public String updateItem(@Valid Item item,@PathVariable int id, ModelMap model) {
		service.updateItem(item);
		
		return "redirect:/viewitems";
		
	}
	@RequestMapping(value = { "/delete-{id}-item" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable String id) {
		service.deleteItem(id);
		return "redirect:/viewitems";
	}
	
	
}
