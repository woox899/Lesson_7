package org.example;

public class Calculator {
    public double calculator(double firstNumber, String oper, double secondNumber) {
        double answer = 0;
        if(oper != "+" && oper != "-" && oper != "*" && oper != "/") {
            throw new IllegalArgumentException("Введен неверный оператор!");
        }
        if(oper == "+") {
            answer = firstNumber + secondNumber;
        } else if (oper == "-") {
            answer = firstNumber - secondNumber;
        } else if(oper == "*") {
            answer = firstNumber * secondNumber;
        } else if(oper == "/") {
            if(secondNumber == 0) {
                throw new IllegalArgumentException("Делить на 0 нельзя!");
            } else {
                answer = firstNumber / secondNumber;
            }
        }
            return answer;
    }
}