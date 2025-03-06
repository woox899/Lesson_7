package org.example;

public class FactorialOfANumber {
    public int calculation(int number) {
        if(number < 0) {
            throw new  IllegalArgumentException("Факториал отрицательного числа неопределяется!");
        }
        int answer = 1;
        for (int i = 1; i <= number; i++) {
            answer *= i;
        }
        return answer;
    }
}
