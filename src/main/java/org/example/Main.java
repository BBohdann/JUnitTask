package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть цілочисельне додатнє число: ");
        int value = new Scanner(System.in).nextInt();
        System.out.println("Значення після додавання: " + new SumCalculator().sum(value));
    }
}