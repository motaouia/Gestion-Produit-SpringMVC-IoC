package org.motaouia.pckgeproducts.controllers;

import org.motaouia.pckgeproduct.entities.Produit;
import org.motaouia.pckgeproduct.metier.IProduitMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
	
	@Autowired
	private IProduitMetier metier;
	
	@RequestMapping(value = "/index")
	public String index(Model model){
		model.addAttribute("produit", new Produit());
		model.addAttribute("listProds", metier.getAllProds());
		return "produits";
	}
	
	//saveProduit
	
	@RequestMapping(value = "/saveProduit")
	public String saveProduit(Produit p, Model model){
		metier.addProduit(p);
		model.addAttribute("produit", new Produit());
		model.addAttribute("listProds", metier.getAllProds());
		return "produits";
	}

}
