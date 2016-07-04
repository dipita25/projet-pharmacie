package com.dipitacompany.app;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestProduit {

	
	@Test
	public void testVendreProduit()
	{
		Pharmacie pharmacie = new Pharmacie();
		Produit produit = new Produit();
		List<Iproduit> liste = new ArrayList<>();
		
		produit.setNom("riz");
		produit.setDateAchat("decembre 2001");
		produit.setQuantite(3);
		liste.add(produit);
		pharmacie.setListeProduit(liste);
		
		int expected = 0;
		pharmacie.vendreProduit(produit, 3);
		int result = produit.getQuantite();
		
		Assert.assertEquals(expected, result);
		
	}
}
