package prog1_samuel_str�mberg;

import java.util.Scanner;

public class exemple {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Skriv namn :");
			String namn=input.nextLine();
		
		System.out.println("Skriv �lder :");
		int �lder = input.nextInt();
		
			System.out.println("Skriv l�ngd :");
			double l�ngd = input.nextDouble();
		
		System.out.println(namn +" �r "+ �lder +" �r gammal och "+ l�ngd +" m l�ng ");
		
		System.out.println("St�mmer det?");
		
		
		
		
	}
}
