package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
      SimpleUser simpleUser = new SimpleUser("theForumUser");

      String result = simpleUser.getUsername();

      if (result.equals("theForumUser")){
          System.out.println("test ok");
      }else {
          System.out.println("Error!");
      }

        Calculator calculator = new Calculator();

      int addResult = calculator.addAToB(45,25);
      int subResult = calculator.substractAFromB(46, 16);
      if (addResult == 70 && subResult == 30){
          System.out.println("Calculator test Ok");
      }else {
          System.out.println("Calculator has error");
      }
    }
}
