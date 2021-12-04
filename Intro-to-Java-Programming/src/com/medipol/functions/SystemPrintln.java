package com.medipol.functions;

public class SystemPrintln {

	public static void main(String[] args) {
		String kelime = "Test verisi";
		println(kelime);
		println("asd");
	}
	
	public static void println(String input) {
		
		System.out.printf(input + "%n");
		
	}

}
