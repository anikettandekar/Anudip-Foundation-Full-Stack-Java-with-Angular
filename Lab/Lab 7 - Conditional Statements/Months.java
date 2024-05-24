package com.anudip.practiceprograms;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month name : ");
        String n = sc.next();

        String month = n.toLowerCase();

        if (month.equals("january") || month.equals("march") || month.equals("may") ||
                month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december")) {
            System.out.println(month + " has 31 days");
        } else if (month.equals("april") || month.equals("june") || month.equals("september") || month.equals("november")) {
            System.out.println(month + " has 30 days");
        } else if (month.equals("february")) {
            System.out.println(month + " has 28/29 days");
        } else {
            System.out.println("Invalid Input");
        }
        
        sc.close();
    }
}
