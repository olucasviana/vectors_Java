package application;

import java.util.Scanner;

import entities.Renting;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
	
		System.out.print("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		Renting[] vect = new Renting[10];
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Renting(name, email, room);
		}
	
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
