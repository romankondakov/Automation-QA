package org.example;

import java.util.Scanner;

public class Enter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextDouble();
        System.out.println("Введите оператор: ");
        String operator = scanner.next();
        System.out.println(num1 + operator + num2 + " = " + Calc.calculator(num1, num2, operator));
        }

    }

