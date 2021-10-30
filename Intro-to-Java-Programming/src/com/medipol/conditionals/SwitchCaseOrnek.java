package com.medipol.conditionals;

public class SwitchCaseOrnek {

	public static void main(String[] args) {
		
		int a = 2;
		switch(a) {
			case 1:
				System.out.println("a = 1'dir.");
				break;
			case 2:
				System.out.println("a = 2'dir.");
				break;
			case 3:
				System.out.println("a = 3'tür.");
				break;
			default:
				System.out.println("a sayısı 1,2 ve 3'ten farklıdır.");
				break;
		}

	}

}
