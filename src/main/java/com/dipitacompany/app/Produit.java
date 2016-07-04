package com.dipitacompany.app;
public class Produit implements Iproduit
{

	private String nom;
	private int quantite;
	private String dateAchat;

	public String getNom()
	{
		return this.nom;
	}

	public void setNom(String nom)
	{
		this.nom=nom;
	}

	public int getQuantite()
        {
                return this.quantite;
        }

        public void setQuantite(int quantite)
        {
                this.quantite=quantite;
        }

	public String getDateAchat()
        {
                return this.dateAchat;
        }

        public void setDateAchat(String dateAchat)
        {
                this.dateAchat=dateAchat;
        }

	@Override
	public String toString()
	{
		return ""+this.nom+"-"+this.quantite+"-"+this.dateAchat;
	}

}
