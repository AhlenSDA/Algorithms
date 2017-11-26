package Factorial;

public class Javatpoint {

    public static void main(String args[]){

        int i;
        int fact = 1;
        int number = 5;   //It is the number to calculate factorial

        for(i = 1 ; i <= number; i++){ // <= is the key here to properly iterate
            fact = fact * i;

            System.out.println("i: " + i);
            System.out.println("fact: " + fact + "\n");
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

