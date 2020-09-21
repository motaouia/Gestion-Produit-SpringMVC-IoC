package org.motaouia.pckgeproduct.metier;

import java.util.Collection;
import java.util.List;

import org.motaouia.pckgeproduct.entities.Produit;

public interface IProduitMetier {
	
	public Produit addProduit(Produit prod);
	public Collection<Produit> getAllProds();
	public Produit getProduitById(String ref);
	public List<Produit> getProdsByMc(String mc);
	public void deleteProduit(String ref);
	public void updateProduit(Produit prod);

}
