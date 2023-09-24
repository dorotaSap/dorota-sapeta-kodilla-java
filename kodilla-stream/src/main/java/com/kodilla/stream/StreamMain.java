package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("---------------------");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator addABC = (text) -> "ABC" + text + "ABC";
        PoemDecorator toUpperCase = String::toUpperCase;
        PoemDecorator addSpecialChar = (text) -> text + " :)";
        PoemDecorator toLowerCase = String::toLowerCase;

        String text1 = " Crazy letters ";
        String beautifiedText1 = poemBeautifier.beautify(text1, addABC);
        System.out.println(beautifiedText1);

        String text2 = "How are you today";
        String beautifiedText2 = poemBeautifier.beautify(text2, toUpperCase);
        System.out.println(beautifiedText2);

        String text3 = "Dzień dobry";
        String beautifiedText3 = poemBeautifier.beautify(text3, addSpecialChar);
        System.out.println(beautifiedText3);

        String text4 = "NIC DWA RAZY SIE NIE ZDARZA";
        String beautifiedText4 = poemBeautifier.beautify(text4, toLowerCase);
        System.out.println(beautifiedText4);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);





    }
}
