/*Create a simple calculator which can perform following operations with two numbers
        1. add
        2. multi
        3. division
        4. sub
        Note: Program should take continuous input on what operation to perform from user. Should take inputs required for operation and print output at every operation.
 */
//added break after each case
package Assignments;

import java.util.Scanner;

public class JA3_SimpleCalculator {
    public static void main(String[] args) {

        //to take input from user
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number : ");
        float firstNum = sc.nextFloat();
        System.out.print("Enter second number : ");
        float secondNum = sc.nextFloat();
                                                //using text block as per system suggestion
        System.out.println("""                  
                What operation do you wish to perform ? \s
                 1. Addition
                 2. Multiplication
                 3. Division
                 4. Subtraction
                 Enter your choice of operation :\s""");
        int operation = sc.nextInt();

        //Check on entered choice. Using enhanced Switch as per system suggestion
        switch (operation) {
            case 1 -> {
                float Add = firstNum + secondNum;
                System.out.println("Addition of the entered values " + firstNum + " and " + secondNum + " = " + Add);
                break;
            }
            case 2 -> {
                float Multiply = firstNum * secondNum;
                System.out.println("Multiplication of the entered values " + firstNum + " and " + secondNum + " = " + Multiply);
                break;
            }
            case 3 -> {
                float Divide = firstNum / secondNum;
                System.out.println("Division of the entered values " + firstNum + " and " + secondNum + " = " + Divide);
                break;
            }
            case 4 -> {
                float Subtract = firstNum - secondNum;
                System.out.println("Subtraction of the entered values " + firstNum + " and " + secondNum + " = " + Subtract);
                break;
            }
            default -> System.out.println("Invalid Entry");
        }
    }
}

