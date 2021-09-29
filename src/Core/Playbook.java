package Core;
import java.util.Arrays;
import static Core.Search.*;
import java.util.Scanner;
import static Core.features.*;

import static Core.Tools.*;
import Core.Tools.*;
public class Playbook {

	  public static void main(String[] args) {
		  	int taille;
	        int Sort_input;
	        int Order_input;
	        int Search_input;
	        
	        
	        Scanner s = new Scanner(System.in);
	        
	        System.out.println("Bonjour veuiller entrer la taille de votre tableau");
	        taille=s.nextInt();

			int[] tab=new int[taille];
			System.out.println("Entrer les valeurs du tableau");
			
			Tools.input(tab);
			
			System.out.println(Arrays.toString(tab));
			
			System.out.println("Choisissez un tri");
		    System.out.println("1)Tri a bulle");
			System.out.println("2)Tri par selection");
			System.out.println("3)Tri Gnome");
			System.out.println("4)Tri par insertion");
			
			Sort_input=s.nextInt();
			
			System.out.println("Choisissez une ordre SVP");
			System.out.println("1)Croissante");
			System.out.println("2)Decroissante");
			
			Order_input=s.nextInt();
			
			System.out.println("Choisissez une recherche");
			System.out.println("1)Recherche Sequentielle");
			System.out.println("2)Recherche Dichotomique");
			System.out.println("3)Recherche ");
			System.out.println("4)Tri par insertion");
			
			Search_input=s.nextInt();
			
			
			if (Sort_input==1) {
				switch(Order_input) {
					case 1:
						Tools.bulle_asc(tab);
						break;
					default:
						Tools.bulle_desc(tab);
						break;
				}
				
			}
			else if(Sort_input ==2) {
				switch(Order_input) {
					case 1:
						Tools.triselection_asc(tab);
						break;
					default:
						Tools.triselection_desc(tab);
						break;
				}
				
			}
			else if(Sort_input==3) {
				switch(Order_input) {
					case 1:
						Tools.gnomeSort_asc(tab);
						break;
					default:
						Tools.gnomeSort_desc(tab);
						break;
				}
			}
			else {
				switch(Order_input) {
					case 1:
						Tools.tri_insertion_asc(tab);
						break;
					default:
						Tools.tri_insertion_desc(tab);
						break;
				}
			}
			
			System.out.println(Arrays.toString(tab));
			
			System.out.println("Entrer une valeur a rechercher");
			
			int search_val = s.nextInt();
			
			if(Search_input == 1) {
				
			}else if(Search_input == 2) {
				
			}else if(Search_input == 3) {
				
			}
			else {
				
			}
				
//			Search search = new Search(0, null);
//			search.three(tab);
			
	  }
	  
}

