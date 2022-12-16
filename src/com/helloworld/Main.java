package com.helloworld;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.print("Enter Limit: ");

        //takes an integer as input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();



        StringBuilder total = new StringBuilder(String.format("\nPrime numbers from 0 to %d are: \n\t", input));


        //for each number till limit, checks if it's prime number or not by using isPrime() method and adds prime number to total.
        for (int i=2;i<input;i++){

            if(isPrime(i)){
                total.append(i).append(", ");
            }

        }

        //deletes the last comma and prints the numbers.
        total.deleteCharAt(total.length() - 2);

        System.out.println(total);
    }


    // Function to see if the number is a prime number
    //takes one number at a time
    //returns true if prime or false if not
    public static boolean isPrime(int x){
        for (int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}