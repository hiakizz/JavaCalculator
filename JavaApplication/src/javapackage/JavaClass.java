package javapackage;

import java.util.Scanner;

public class JavaClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int na, nb, op;
        
        System.out.println("Type the first number: ");
        na = sc.nextInt();
        System.out.println("Choose the operation:"
                + "\n1: +"
                + "\n2: -"
                + "\n3: /"
                + "\n4: *");
        op = sc.nextInt();
        System.out.println("Type the second number: ");
        nb = sc.nextInt();
        
        if(op == 1){
            System.out.println("Result: " + (na + nb));
        }
        if(op == 2){
            System.out.println("Result: " + (na - nb));
        }
        if(op == 3){
            System.out.println("Result: " + (na / nb));
        }
        if(op == 4){
            System.out.println("Result: " + (na * nb));
        }
        if(op > 4){
            System.out.println("Choose a valid option!");
        }
    }
}