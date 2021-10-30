package hafta2b;
import java.util.Scanner;
import java.lang.Math;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�lk say�y� girin: ");
		int a = input.nextInt();
		System.out.print("�kinci say�y� girin: ");
		int b = input.nextInt();
		System.out.print("Son say�y� girin: ");
		int c = input.nextInt();
		
		//System.out.println(a+b+c);
		int diskriminant = ((int)Math.pow(b,2))-(4*a*c);
		//System.out.println(diskriminant);
	
		if(diskriminant < 0) {
			System.out.println("Denklemin ger�ek say�larla ifade edilebilecek bir k�k� yoktur.");
		} else if(diskriminant == 0) {
			System.out.println("Denklemin birbiriyle �ak��an ortak k�kleri: " + (-b)/(2*a));
		} else if(diskriminant > 0) {
			System.out.println("1.k�k: " + ( (-b) + Math.sqrt(diskriminant) ) / (2*a) );
			System.out.println("2.k�k: " + ( (-b) - Math.sqrt(diskriminant) ) / (2*a) );
		}
		

	}

}
