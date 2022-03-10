package net.javaguides.springmvc.helloworld.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ramesh Fadatare
 */
@Controller
public class MyController {

	@RequestMapping("/startShopPage")
	public String startShopPageController() {

		return "startShopPage";
	}

	@RequestMapping("/catalog")
	public String catalogController() {

		return "catalog";
	}

	@RequestMapping("/basket")
	public String basketController() {

		return "basket";
	}

	@RequestMapping("/adding-product")
	public String addingProductController() {



		return "adding-product";
	}
}