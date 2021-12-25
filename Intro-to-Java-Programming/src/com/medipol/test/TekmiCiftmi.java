package com.medipol.test;


public  class TekmiCiftmi {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int pi = 3;
		System.out.println(tekCiftBul(5));
	}
	
	public static boolean tekCiftBul(final int n) {

		if(n %2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
