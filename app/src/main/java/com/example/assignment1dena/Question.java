package com.example.assignment1dena;

public class Question {
    String question= "What of the following equals ";
    int number1 ;
    int number2;
    String formQuestion(){
        number1 = (int)(Math.random() * 10) + 1;
        number2 = (int)(Math.random() * 10) + 1 ;
          return question + " " + number1 + " + " + number2;
    }

    String rightChoice(){
        StringBuilder result = new StringBuilder();
        for(int i=0; i < number2; i++){
            result.append(number1);
        }
        return result.toString();
    }

    String wrongChoice(){
        StringBuilder result = new StringBuilder();
        int minusWhat = (int)(Math.random()*10 )+1;
        for(int i=0; i < number2-minusWhat; i++){
            result.append(number1);
        }
        return result.toString();
    }

}
