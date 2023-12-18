package fzk;

import java.util.Scanner;

public class Asmd {

        public static void main(String[] args) {
            int first, second, add, substract, multiply;
            float devide;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter two number :");
            first = scanner.nextInt();
            second=scanner.nextInt();
            add = first+ second;
            substract = first- second;
            multiply = first * second;
            devide = (float) first / second;
            System.out.println("sum = " + add);
            System.out.println("Difference ="+ substract);
            System.out.println("Multiplication =" + multiply);
            System.out.println("Civision" +devide);

        }
    }


