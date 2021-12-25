package com.medipol.functions;

public class RecursiveSayilariYazdir {

    public static void main(String[] args)
    {
        recursiveMethod(5);
        int sonuc =kuvvetAl(3,3);
        int usAl = (int)Math.pow(3,5);
        System.out.println(sonuc);
        System.out.println(usAl);
        
        
    }
    
    public static int kuvvetAl(int a,int b) {
    	
    	if(b == 0) {
    		return 1;
    	}
    	else {
    		return a * kuvvetAl(a, b-1);
    	}
    }

    

    static void recursiveMethod(int num)
    {
      
        if(num == 0)
            return;
        System.out.print(num + " ");
        num--;
        recursiveMethod(num);
       
    }
    
    static void sayilariYazdir(int parameter) {
    	parameter--;
    	if(parameter == 0) {
    		return;
    	}
    	else {
    		System.out.println(parameter + " ");
    		sayilariYazdir(parameter);
    	}
    }
    
    
    
    public static void ekranaYazdir(int parameter) {
    
    	parameter--;
    	if(parameter == 0) {
    		return;
    	}
    	else {
    		System.out.println(parameter);
    		parameter--;
    		ekranaYazdir(parameter);
    		
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
