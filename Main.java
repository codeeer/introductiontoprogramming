package hafta2b;
import java.util.Scanner;
import java.lang.Math;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk sayýyý girin: ");
		int a = input.nextInt();
		System.out.print("Ýkinci sayýyý girin: ");
		int b = input.nextInt();
		System.out.print("Son sayýyý girin: ");
		int c = input.nextInt();
		
		//System.out.println(a+b+c);
		int diskriminant = ((int)Math.pow(b,2))-(4*a*c);
		//System.out.println(diskriminant);
	
		if(diskriminant < 0) {
			System.out.println("Denklemin gerçek sayýlarla ifade edilebilecek bir kökü yoktur.");
		} else if(diskriminant == 0) {
			System.out.println("Denklemin birbiriyle çakýþan ortak kökleri: " + (-b)/(2*a));
		} else if(diskriminant > 0) {
			System.out.println("1.kök: " + ( (-b) + Math.sqrt(diskriminant) ) / (2*a) );
			System.out.println("2.kök: " + ( (-b) - Math.sqrt(diskriminant) ) / (2*a) );
		}
		

	}

}
