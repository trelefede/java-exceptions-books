package org.lessons.java.exceptions.books;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quanti libri vuoi aggiugere? ");
		int n = sc.nextInt();
		sc.nextLine();

		Book[] catalogo = new Book[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Libro numero: " + (i + 1));
			System.out.println("Inserisci titolo: ");
			String titolo = sc.nextLine();

			System.out.println("Inserisci autore: ");
			String autore = sc.nextLine();

			System.out.println("Inserisci editore: ");
			String editore = sc.nextLine();

			System.out.println("Inserisci numero pagine: ");
			int pagine = sc.nextInt();
			sc.nextLine();

			try {
				catalogo[i] = new Book(titolo, pagine, autore, editore);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(Arrays.toString(catalogo));

		sc.close();

	}
}
