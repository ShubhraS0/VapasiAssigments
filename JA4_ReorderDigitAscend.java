/* For given number (int), order digits in the number in ascending order
     ex:
             i/p 613       o/p 136
             i/p 01020   o/p  00012
*/
/*  Was able to achieve reverse order instead
*/
package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class JA4_ReorderDigitAscend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println( "Enter length of digit : ");
        int n = sc.nextInt();
        System.out.println("Enter the digit : ");
        int num = sc.nextInt();

        int [] arrayName = new int [n];

        for (int i= 0; i < n; i++)
        {
            int remainder = num % 10;
            arrayName[i] = remainder;
            num = num /10 ;
            System.out.print(arrayName[i] + " "); //printing for the reverse order
         }
    }
}
