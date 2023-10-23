package com.kodilla;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.FirstChallenge;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        System.out.println(" ");

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);

        System.out.println(" ");


        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.handleException(1.5, 1.5);
    }


}