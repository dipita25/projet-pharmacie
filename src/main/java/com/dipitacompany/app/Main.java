package com.dipitacompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean conditionArret=false;
		int valeur;
        boolean reponse=false;
        String choix;
        Pharmacie pharmacie = new Pharmacie();
        List<Iproduit> liste = new ArrayList<>();
	do
	{
		System.out.println("que désirez vous effectuer comme opération ??:");
		System.out.println("(1) entrer la liste des produits");
		System.out.println("(2) vendre un produit");
		System.out.println("(3) afficher l'aide");

		Scanner sc = new Scanner(System.in);
		valeur = sc.nextInt();
		
		switch(valeur)
		{
			case(1):
			{
				sc.nextLine();
				do
				{
					Produit produit = new Produit();
			
					System.out.println("entre le nom du produit: ");
					String nomProduit = sc.nextLine();
					produit.setNom(nomProduit);
				
					System.out.println("entre la quantite du produit: ");
					int quantiteProduit=sc.nextInt();
					sc.nextLine();
					produit.setQuantite(quantiteProduit);

					System.out.println("entre la date d'achat du produit: ");
					String dateAchat = sc.nextLine();
					produit.setDateAchat(dateAchat);
				
					System.out.println("voulez vous continuer ?? y/n ");
					String carac = sc.nextLine();

					liste.add(produit);

					if (carac.equals("n"))
					{
						System.out.println("----------------------------------------");
                                            	System.out.println("voici la liste des produits enregistrés:");
						System.out.println("----------------------------------------");

						pharmacie.setListeProduit(liste);

						reponse=true;
						for(Iproduit p:liste)
            		                	{
	                                        	System.out.println(p.toString());
                           				}
						System.out.println(pharmacie.toString());
					}

				}while(reponse==false);
				break;		
			}
	

			case(2):
			{
				sc.nextLine();
				Produit produitAVendre = new Produit();

				System.out.println("entrez le nom du produit à vendre: ");
				String nomProduitVente=sc.nextLine();
				produitAVendre.setNom(nomProduitVente);

				System.out.println("entre la quantité à vendre:");
				int quantiteVente=sc.nextInt();
				sc.nextLine();
				produitAVendre.setQuantite(quantiteVente);
				
				pharmacie.vendreProduit(produitAVendre,quantiteVente);
				System.out.println(pharmacie.toString());
				
				break;
			}

			case(3):
			{
				System.out.println("aide indisponible pour ce service");
				break;
			}

		}

		System.out.println("revenir au menu principal ?? y/n");
		String choixTerminer = sc.nextLine();
			if(choixTerminer.equals("n"))
			{
				conditionArret=true;
			}		

		}while(conditionArret==false);

	}

}
