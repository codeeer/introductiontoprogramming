package com.medipol.conditionals;

import java.util.Scanner;

public class TurSorusu {

	/*
	 * Bir turizm şirketi farklı tur çeşitlerinden oluşan bir liste sunuyor. Kullanıcı bu listeden ilgilendiği bir turu seçtiğinde, o turla ilişkili ayrıntılı bilgiye ulaşıyor. Burada aşağıdaki basit algoritmayı uygulayacağız.

		1. Tur seçenekleri ekrana yazdırılır.
		2. Kullanıcıdan bu tur seçeneklerinden bir tanesini seçmesi istenir.
		3. Kullanıcının seçimine uygun olan tur hakkındaki bilgiler ekrana yazdırılır.
	 */
	public static void main(String[] args) {
	     
        Scanner giris = new Scanner(System.in);
        int i;
        System.out.println("Portakal Turizm A.S. Sunar");
        System.out.println("(1) Orta Avrupa Turu");
        System.out.println("(2) Amerika Turu");
        System.out.println("(3) Uzak Dogu Turu");
        System.out.println("Seciminiz?");
        i = giris.nextInt();
        switch (i) {
        case 1 :
            System.out.println("Ucak ile Viyana, Budapeste, Prag");
            System.out.println("4 yildizli otellerde sok! 1700$\n");
            break;
        case 2 :
            System.out.println("Ozel ucak ile New York, Boston, Los Angeles");
            System.out.println("5 yildizli otellerde sok! 3700$\n");
            break;
        case 3 :
            System.out.println("Ozel ucak ile Bang Kong, Hong Kong");
            System.out.println("Tokyo, Pekin");
            System.out.println("5 yildizli otellerde sok! 4000$\n");
            break;
        default :
            System.out.println("Hatali secim! 1, 2 veya 3 girilmeli");
            break;
        }
    
    }

}
