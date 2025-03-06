package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Факториал
        FactorialOfANumber factorial = new FactorialOfANumber();
        System.out.println(factorial.calculation(1));

        //Площадь треугольника
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle();
        System.out.println(areaOfATriangle.calculation(12, 12, 20));

        //Калькулятор
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculator(12, "/", 6));

        //Сравнивание 2 чисел
        ComparisonOfNumbers comparisonOfNumbers = new ComparisonOfNumbers();
        System.out.println(comparisonOfNumbers.comparisonOfNumbers(-1.0, ">", 240.0));
    }
}