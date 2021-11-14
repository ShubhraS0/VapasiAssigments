package Assignments;/*Assignment 1 - Write a program to find smallest of 4 numbers.
        Input - 5,8,2,3
        Output - Smallest number is 2
*/

import java.util.Scanner;
public class JA1_FindSmallestNum {
    public static void main(String[] args) {

        //to take input from user
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number : ");
        int a= sc.nextInt();
        System.out.print("Enter second number : ");
        int b= sc.nextInt();
        System.out.print("Enter third number : ");
        int c= sc.nextInt();
        System.out.print("Enter fourth number : ");
        int d= sc.nextInt();

        //Calculate for the smallest number and print it
        if (a<=b && a<=c && a<=d) {
            System.out.println(a + " <1st> is the smallest number entered");
        }
        else if (b<=a && b<=c && b<=d) {
            System.out.println(b + " <2nd> is the smallest number entered");
        }
        else if (c<=a && c<=b && c<=d) {
            System.out.println(c + " <3rd> is the smallest number entered");
        }
        else
            System.out.println(d + " <4th> is the smallest number entered");
    }
}
