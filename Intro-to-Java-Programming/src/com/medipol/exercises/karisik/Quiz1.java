package com.medipol.exercises.karisik;

public class Quiz1 {
	//myStery fonksiyonu ne ise yarar?
	public static String[] mystery(String[] args) {
		int i = 0;
		
		while (i < (args.length + 1) / 2) {
			String hold = args[i];
			args[i] = args[args.length - (++i)];
			args[args.length - i] = hold;
		}
		return args;
	}

	public static void main(String[] args) {
		
		String[] postMystery = mystery(args);
		for (int i = 0; i < postMystery.length; i++) {
			System.out.print(postMystery[i] + " ");
		}
	}
	
	
}
