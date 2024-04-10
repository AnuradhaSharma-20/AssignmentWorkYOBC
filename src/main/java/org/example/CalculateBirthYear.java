package org.example;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateBirthYear {

    int validage;


    public int calculatebirthyear(int age) {
        //Checking commit
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int yr = currentyear - age;
        return yr;
    }

    public String printgreetings(String name, int age) {
        return ("Hi " + name + " you were born in " + calculatebirthyear(age));
    }


    public Boolean isAgeValid(String strAge) {
        int age;
        try {  //try and catch function is used to throw exception during age validation
            age = Integer.parseInt(strAge);// converting  string value to an integer value

        } catch (NumberFormatException e) { //throw an exception if age is not in int.
            System.out.println("Invalid Age. Age must be numeric");
            return false;
        }

        if (age < 0) {
            System.out.println("Invalid Age. Age must be a positive number");
            return false;
        } else {

            validage = age;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        String strage = scanner.nextLine();
        CalculateBirthYear testobj = new CalculateBirthYear();

        if (testobj.isAgeValid(strage)) {
            System.out.println(testobj.printgreetings(name, testobj.validage));
        } //else
            //System.out.println("invalid age.") ;

        }
    }








