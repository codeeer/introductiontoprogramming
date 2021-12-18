package com.medipol.functions;

import java.util.Scanner;

public class tekMiCiftMi {

    public static void main(String[] args) {
        //creating Scanner class object
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        //reading value from the user
        int num=scan.nextInt();
        //method calling
        findEvenOrOdd(num);
    }

    //user defined method
    public static void findEvenOrOdd(int num)
    {
        //method body
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}
