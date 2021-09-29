package Core;
import java.util.Scanner;

public abstract class  Tools {
	public static void  input(int[]tab){
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=tab.length-1; i++)
		{
			tab[i]=scan.nextInt();

		}
	}

	

	//Methode tri a bulle ordre croissante/decroissante
	public static void bulle_asc(int[]table)
	{
		for(int i=0; i<table.length; i++)
		{
			
		  for(int j=0; j<table.length-1; j++)
		    {
			    if(table[j]>table[j+1]) {
			    	int temp=table[j];
			    	    table[j]=table[j+1];
			    	    table[j+1]=temp;
			    }
	    	}
		}
	}
	
	public static void bulle_desc(int[]table)
	{
		for(int i=0; i<table.length; i++)
		{
			
		  for(int j=0; j<table.length-1; j++)
		    {
			    if(table[j]<table[j+1]) {
			    	int temp=table[j];
			    	    table[j]=table[j+1];
			    	    table[j+1]=temp;
			    }
	    	}
		}
	}
	
	//Methode Tri selection crois/decrois
	
	public static void triselection_asc(int[]tab)
	{
		int i,k,temp,min;
		for( i=0; i<tab.length-1; i++)
		{
			min=i;
			
		  for(int j=i+1; j<tab.length; j++)
		    {
			  
			    if(tab[j]<=tab[min]) {
			    	min=j;
			    	
			    }
	    	}
		  temp=tab[i];
		  tab[i]=tab[min];
		  tab[min]=temp;
		  
		}
	}
	
	public static void triselection_desc(int[]tab)
	{
		int i,k,temp,min;
		for( i=0; i<tab.length-1; i++)
		{
			min=i;
			
		  for(int j=i+1; j<tab.length; j++)
		    {
			  
			    if(tab[j]>tab[min]) {
			    	min=j;
			    	
			    }
	    	}
		  temp=tab[i];
		  tab[i]=tab[min];
		  tab[min]=temp;
		  
		}
	}
	
	//Methode Gnomesort
	
	public static void gnomeSort_asc(int tab1[])
    {
        int i= 0;
        
  
        while (i< tab1.length) {
            if (i == 0)
                i++;
            if (tab1[i] >= tab1[i - 1])
                i++;
            else {
                int temp = 0;
                temp = tab1[i];
                tab1[i] = tab1[i - 1];
            tab1[i - 1] = temp;
                i--;
            }
        }
        return;
    }
	
	public static void gnomeSort_desc(int tab1[])
    {
        int i= 0;
  
        while (i< tab1.length) {
            if (i == 0)
                i++;
            if (tab1[i] <= tab1[i - 1])
                i++;
            else {
                int temp = 0;
                temp = tab1[i];
                tab1[i] = tab1[i - 1];
            tab1[i - 1] = temp;
                i--;
            }
        }
        return;
    }
	
		
	
	
	private static void Swap(int i, int j) {
		// TODO Auto-generated method stub
		
	}


	//Autres methodes
	//Methode tri insertion

    static void tri_insertion_desc(int[] tab) {
        int n = tab.length;
        for (int i = 1; i < n; i++) {
            int k = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j] < k) {
                tab[j + 1] = tab[j];
                j--;
            }

            tab[j + 1] = k;
        }
    }
	
    static void tri_insertion_asc(int[] tab) {
        int n = tab.length;
        for (int i = 1; i < n; i++) {
            int k = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j] > k) {
                tab[j + 1] = tab[j];
                j--;
            }

            tab[j + 1] = k;
        }
    }
	
	
	//Methode de recherche lineaire
	
	public static boolean search(int[]table, int a)
	{
		for(int i=0; i<table.length; i++)
		{
			if(table[i]==a)
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	}
	

