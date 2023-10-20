package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide (double a, double b) throws ArithmeticException{
        try {
            if (b == 0){
            throw new ArithmeticException(" Nie dzielimy przez zero");
        }
        return a / b;
    }catch (ArithmeticException e){
            System.out.println("Błąd arytmetyczny" + e.getMessage());
            return -1.0;
        }finally {
            System.out.println("Blok finalny");
        }
    }
}
