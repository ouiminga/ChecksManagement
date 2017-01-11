/**
 * 
 */
package bank.checks.controller;

import java.util.Scanner;

/**
 * @author ouiminga
 *
 */
public class Heart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createCheck();
		createCheckbook();
		createDemand();

	}
	

	private static void createCheckbook() {
		// TODO Auto-generated method stub
		
	}


	private static void createCheck() {
		// TODO Auto-generated method stub
		
	}


	private static void createDemand() {
		String prenom = new String();
	char reponse = ' ';
	Scanner sc = new Scanner(System.in);
	do{
	System.out.println("Donnez un prénom : ");
	prenom = sc.nextLine();
	System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
	do{
	System.out.println("Voulez-vous réessayer ? (O/N)");
	reponse = sc.nextLine().charAt(0);
	}while(reponse != 'O' && reponse != 'N');
	}while (reponse == 'O');
	System.out.println("Au revoir...");
	}

}
