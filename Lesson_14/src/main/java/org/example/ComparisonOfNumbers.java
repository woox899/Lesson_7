package org.example;

public class ComparisonOfNumbers {
    public boolean comparisonOfNumbers(double firstNumber, String oper, double secondNumber) {
        boolean answer = false;
        if(oper != ">" && oper != "<" && oper != "=") {
            throw new IllegalArgumentException("Введен неверный оператор!");
        }
        if(oper == ">") {
            answer = firstNumber > secondNumber;
        } else if (oper == "<") {
            answer = firstNumber < secondNumber;
        } else if (oper == "=") {
            answer = firstNumber == secondNumber;
        }
        return answer;
    }
}
