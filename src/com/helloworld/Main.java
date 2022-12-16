package com.helloworld;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.print("Enter Limit: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        StringBuilder total = new StringBuilder(String.format("\nPrime numbers in %d are: ", input));

        for (int i=2;i<input;i++){

            if(isPrime(i)){
                total.append(i).append(", ");
            }

        }
        System.out.println(total);
    }


    public static boolean isPrime(int x){
        for (int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }


        }

        return true;
    }
}


//Perfect for one number;



//        Date now = new Date();
//        System.out.println(now);
//
//        String[][] floors = new String[4][3];
//        floors[0][0]= "Reception";
//        floors[0][1]= "Reception";
//        floors[0][2]= "Reception";
//        floors[1][0] = "Gaye Holud";
//        floors[1][1] = "Kids Zone";
//        floors[1][2] = "Dance floor";
//        floors[2][0] = "Wrestling";
//        floors[2][1] = "Racing";
//        floors[2][2] = "Shooting ";
//        floors[3][0] = "Smoking ";
//        floors[3][1] = "Booze ";
//        floors[3][2] = "You Know What ";
//
//        String floors_in_string = Arrays.deepToString(floors);
//
//
//
//        System.out.println(floors_in_string);