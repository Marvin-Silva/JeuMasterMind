package test;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	public static void main (String []args) {
	
	// Creation du tableau
	
	
	int [] tab = {1,2,3,4,5};
	boolean isCorrect = false;
	
	int[] result = new int [tab.length]; // creation et instantiation du tableau
	int j =0;
	int BienPlace =0; 
	int MalPlace = 0;
	int BienPlace1 []= {BienPlace, MalPlace};
	
	System.out.println("Bienvenu dans MasteMind  ");
	System.out.println("===============================  ");
	System.out.println("L'objectif du jeu est de trouver la bonne combination du code MasterMind:   ");
	System.out.println("1 - à chaque nombre rentree, il vous affichera le nombre [BienPlacé, MalPlacé] ");

	System.out.println("2 - Vous avez 10 essais pour trouver le code");

	System.out.println("3 - Pour gagner il faut monter 5 fois le nombre du cote BienPlace ");


	System.out.println("Entree des nombre de 1 à 10 ");
	
	do {
	
	Scanner uti = new Scanner (System.in); // entree d'utilisateur
	int resu = uti.nextInt();
	
	
	for (int i =0; i < tab.length; i++) { // parcourir le tableau
	
		
		if (resu== tab[i]) { // condition de l'entree, si l'entree est egal au valeur du tableau, bingo
			result[i] = resu;
			isCorrect = true;
			
		}if (isCorrect) {
			if(i == j) {

				BienPlace++;	
			}else {
				
				MalPlace++;
			}
			isCorrect = false;
		}
	}
	j++;
	System.out.println(BienPlace + " " +MalPlace);
	if (BienPlace ==5) {
		System.out.print("Félicitations Vous avez gagné ");
	} 
	
	
		
	}while (j < 10);
	
}
}

	
	

