package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earningsBubblegum = 202, earningsToffee = 118, earningsIceCream = 2250, earningsMilkChocolate = 1680, earningsDoughnut = 1075, earningsPancake = 80;
        double income = earningsBubblegum + earningsToffee + earningsIceCream + earningsMilkChocolate + earningsDoughnut + earningsPancake;

        System.out.printf("Earned amount:%n" +
                "Bubblegum: %d%n" +
                "Toffee: %d%n" +
                "Ice cream: %d%n" +
                "Milk chocolate: %d%n" +
                "Doughnut: %d%n" +
                "Pancake: %d%n%n" +
                "Income: %.1f%n", earningsBubblegum, earningsToffee, earningsIceCream, earningsMilkChocolate, earningsDoughnut, earningsPancake, income);

        System.out.println("Staff expenses:");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses:");
        double otherExpenses = scanner.nextDouble();

        double netIncome = income - staffExpenses - otherExpenses;

        System.out.printf("Net income: $%.1f", netIncome);
    }
}
