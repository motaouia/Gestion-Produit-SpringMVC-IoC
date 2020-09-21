package org.motaouia.pckgeproduct.dao;

import java.util.Collection;
import java.util.List;

import org.motaouia.pckgeproduct.entities.Produit;

public interface IProduitDao {

	public Produit addProduit(Produit prod);
	public Collection<Produit> getAllProds();
	public Produit getProduitById(String ref);
	public List<Produit> getProdsByMc(String mc);
	public void deleteProduit(String ref);
	public void updateProduit(Produit prod);
	
}
