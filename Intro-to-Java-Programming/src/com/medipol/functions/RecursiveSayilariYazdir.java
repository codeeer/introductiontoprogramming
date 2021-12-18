package com.medipol.functions;

public class RecursiveSayilariYazdir {

    public static void main(String[] args)
    {
        recursiveMethod(5);
    }

    static void recursiveMethod(int num)
    {
        num--;
        if(num == 0)
            return;
        System.out.print(num + " ");
        recursiveMethod(num);
    }
}
