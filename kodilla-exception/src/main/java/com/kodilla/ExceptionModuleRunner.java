package com.kodilla;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.FirstChallenge;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
        System.out.println(" ");

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }


}