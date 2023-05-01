package org.example;


public class Calc {

    public static double calculator (int num1, int num2, String operator){
        double result = 0.0;
        switch (operator) {
            case "+" -> result = sum(num1, num2);
            case "-" -> result = substract(num1, num2);
            case "*" -> result = multiply(num1, num2);
            case "/" -> result = divide(num1, num2);
            case "%" -> result = modulus(num1, num2);
            default -> {
                System.out.println("Ошибка! Некорректный оператор. ");
                System.exit(0);
            }
        }

        return result;
    }

    private static double modulus(int num1, int num2) {

        return (num1 * num2) / 100 ;
    }

    private static double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Ошибка! Деление на 0 невозможно. ");
            System.exit(0);
        }
        return num1 / num2;
    }

    private static double multiply(int num1, int num2) {

        return num1 * num2;
    }

    private static double substract(int num1, int num2) {

        return num1 - num2;
    }

    private static double sum(int num1, int num2) {

        return num1 + num2;
    }

}
