package org.motaouia.pckgeproduct.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.motaouia.pckgeproduct.entities.Produit;

public class ProduitDaoImpl implements IProduitDao {
	private Map<String, Produit> prodsMap = new HashMap<String, Produit>();

	@Override
	public Produit addProduit(Produit prod) {
		prodsMap.put(prod.getReferenceProduit(), prod);
		return prod;
	}

	@Override
	public Collection<Produit> getAllProds() {
		return (Collection<Produit>) prodsMap.values();
	}

	@Override
	public Produit getProduitById(String ref) {
		Produit produit = prodsMap.get(ref);
		if (produit != null) {
			return produit;
		} else {
			throw new RuntimeException("Produit Introuvable");
		}
	}

	@Override
	public List<Produit> getProdsByMc(String mc) {
		List<Produit> prodsByMc = new ArrayList<Produit>();
		for (Produit p : prodsMap.values()) {
			if (p.getDesignationProduit().contains(mc)) {
				prodsByMc.add(p);
			}
		}
		return prodsByMc;
	}

	@Override
	public void deleteProduit(String ref) {
		Produit p = this.getProduitById(ref);
		if (p != null) {
			prodsMap.remove(ref, p);
		}

	}

	@Override
	public void updateProduit(Produit prod) {
		prodsMap.put(prod.getReferenceProduit(), prod);
	}
	
	public void init() {
		System.out.println("KoooKOOOOO");
		this.addProduit(new Produit("LG71", "SMART TV", 9800.90, 250));
		this.addProduit(new Produit("Samsung 54A", "Ecran", 780.80, 420));
		this.addProduit(new Produit("HP SXP", "PC Portable", 12500, 180));
		this.addProduit(new Produit("Huwaei ht", "SMART Phone", 5500.70, 800));
	}

}