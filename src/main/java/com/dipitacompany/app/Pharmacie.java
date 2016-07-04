package com.dipitacompany.app;
import java.util.List;
import java.util.ArrayList;

public class Pharmacie
{

	private List<Iproduit> listeProduit;
	private String nomPharmacie;

	public Pharmacie()
	{
		this.listeProduit=FactoryProduit.creerProduit();
	}
	
	public List<Iproduit> getListeProduit()
        {
                return this.listeProduit;
        }

        public void setListeProduit(List<Iproduit> produit)
        {
                this.listeProduit=produit;
        }

	public String getNomPharmacie()
        {
                return this.nomPharmacie;
        }

        public void setNomPharmacie(String nomPharmacie)
        {
                this.nomPharmacie = nomPharmacie;
        }

	
	public void vendreProduit(Produit p,int quantite)
	{
		if(listeProduit != null)
		{
			boolean produitTrouve=false;
			for(Iproduit pro:listeProduit)
			{
				if(p.getNom().equals(pro.getNom()))
				{
					produitTrouve=true;
					pro.setQuantite(pro.getQuantite()-quantite);
					System.out.println("vente effectuée avec succès");
					break;
				}
			}
			if (produitTrouve==false)
			{
				System.out.println("ce produit n'est pas enregistré");
			}
		}
		else
		{
			System.out.println("liste des produits est nulle");
		}
	}
	

	@Override
	public String toString()
	{
		return ""+this.listeProduit.toString();
	}
}
