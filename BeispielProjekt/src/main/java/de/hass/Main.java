package de.hass;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		
				Scanner tastatur = new Scanner(System.in);
				
				String eingabe;
				
				System.out.println("Bitte Text eingeben");
				eingabe = tastatur.nextLine();
				
				
				System.out.println(eingabe.toUpperCase());
				
		}

	}