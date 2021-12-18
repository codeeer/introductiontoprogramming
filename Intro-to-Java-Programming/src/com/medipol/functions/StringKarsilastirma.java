package com.medipol.functions;

public class StringKarsilastirma {

    public static void main(String[] args) {
        String message = "Is Equal";
        String operationMessage = message;
        System.out.println("== operator kıyaslaması: "+message == operationMessage);
        System.out.println("Equals() method kıyaslaması: "+message.equals(operationMessage));

    }
}
