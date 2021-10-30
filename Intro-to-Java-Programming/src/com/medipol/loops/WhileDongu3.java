package com.medipol.loops;

public class WhileDongu3 {

	public static void main(String[] args) {

        int faktoriyel=1;
        int carpan=1;
        while(carpan<=10) {
            faktoriyel=faktoriyel*carpan; //1*1, 1*2, 2*3, 6*4, 24*5...
            System.out.println(carpan+" faktoriyel: "+faktoriyel);
            carpan++;
        }
    }

}
