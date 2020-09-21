package org.motaouia.pckgeproduct.metier;

import java.util.Collection;
import java.util.List;

import org.motaouia.pckgeproduct.dao.IProduitDao;
import org.motaouia.pckgeproduct.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class ProduitMetierImpl implements IProduitMetier {
	
	private IProduitDao dao;

	@Override
	public Produit addProduit(Produit prod) {
		return dao.addProduit(prod);
	}

	@Override
	public Collection<Produit> getAllProds() {
		return dao.getAllProds();
	}

	@Override
	public Produit getProduitById(String ref) {
		return dao.getProduitById(ref);
	}

	@Override
	public List<Produit> getProdsByMc(String mc) {
		return dao.getProdsByMc(mc);
	}

	@Override
	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
	}

	@Override
	public void updateProduit(Produit prod) {
		dao.updateProduit(prod);
	}

	public void setDao(IProduitDao dao) {
		this.dao = dao;
	}
	
}