package com.kodilla;

 class Calculator {
    public int addAToB(int a, int b){
      return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }

 }
public class Calculators {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
       int result = calculator.addAToB(34, 45);
       int result1 = calculator.subtraction(64, 54);

       System.out.println(result);
        System.out.println(result1);
    }
}