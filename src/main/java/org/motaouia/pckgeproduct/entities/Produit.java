package org.motaouia.pckgeproduct.entities;

import java.io.Serializable;

public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String referenceProduit;
	private String designationProduit;
	private double prixProduit;
	private int quantiteProduit;
	
	public Produit() {
		super();
	}

	public Produit(String referenceProduit, String designationProduit, double prixProduit, int quantiteProduit) {
		super();
		this.referenceProduit = referenceProduit;
		this.designationProduit = designationProduit;
		this.prixProduit = prixProduit;
		this.quantiteProduit = quantiteProduit;
	}

	public String getReferenceProduit() {
		return referenceProduit;
	}

	public void setReferenceProduit(String referenceProduit) {
		this.referenceProduit = referenceProduit;
	}

	public String getDesignationProduit() {
		return designationProduit;
	}

	public void setDesignationProduit(String designationProduit) {
		this.designationProduit = designationProduit;
	}

	public double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public int getQuantiteProduit() {
		return quantiteProduit;
	}

	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}

}