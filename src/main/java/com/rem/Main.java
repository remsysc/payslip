package com.rem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basicSalary = 0.0;
        double taxRate = 0.0;
        double bonuses = 0.0;

        //basic salary
        while (true) {
            try {
                System.out.print("Enter the basic salary: ");
                basicSalary = Double.parseDouble(scanner.nextLine());

                if (basicSalary < 0) {
                    System.out.println("Salary cannot be negative. Please enter a positive number.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the basic salary.");
            }
        }

        //tax rate
        while (true) {
            try {
                System.out.print("Enter the tax rate (from 10% to 50%): ");
                taxRate = Double.parseDouble(scanner.nextLine());

                if (taxRate < 10 || taxRate > 50) {
                    System.out.println("Tax rate must be between 10% and 50%. Please try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the tax rate.");
            }
        }

        while (true) {
            try {
                System.out.print("Enter the bonuses: ");
                bonuses = Double.parseDouble(scanner.nextLine());

                if (bonuses < 0) {
                    System.out.println("Bonuses cannot be negative. Please enter a positive number.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the bonuses.");
            }
        }

        scanner.close();

        taxRate = taxRate / 100;

        double taxDeduction = basicSalary * taxRate;

        double netSalary = basicSalary - taxDeduction + bonuses;

        // payslip details
        System.out.println("\n*********** MyPayslip *********** ");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Tax Deduction (" + (taxRate * 100) + "%): " + taxDeduction);
        System.out.println("Bonuses: " + bonuses);
        System.out.println("-------------------------");
        System.out.println("Net Salary: " + netSalary);
    }
}
