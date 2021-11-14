/*Assignment 2 - Write a program to check whether an entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/

package Assignments;

import java.util.Scanner;
public class JA2_CheckCharCase {
    public static void main(String[] args) {

        //to take input from user
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter a character : ");
        char a = sc.next().charAt(0);

        int asciiValue = a;
        if (asciiValue >= 97 && asciiValue <= 122) {
            System.out.println("You have entered " + a + ". Its Lowercase character.");
        } else if (asciiValue >= 65 && asciiValue <= 91) {
            System.out.println("You have entered " + a + ". Its Uppercase character.");
        }
/*        else if (asciiValue >= 30 && asciiValue <= 39) {
            System.out.println("You have entered " + a + ". Its a Numeral value.");
        }
 */
    else if ((asciiValue >= 32 && asciiValue <= 47 ) ||
                  (asciiValue >= 58 && asciiValue <= 64 ) ||
                  (asciiValue >= 91 && asciiValue <= 96 ) ||
                  (asciiValue >= 123 && asciiValue <= 126 ))
        {
            System.out.println("You have entered " + a + ". Its a Special character.");
        }
            else {
            System.out.println( "Entered value is not a character.");
        }
    }
}

