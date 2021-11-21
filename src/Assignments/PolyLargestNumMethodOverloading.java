/* Polymorphism:-
1) Find the largest of 2 numbers and largest of 3 numbers(Apply method overloading concept) */


public class PolyLargestNumMethodOverloading {
    public static void main(String[] args) {

//        //to take input from user
//        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
//        System.out.println("Enter first number : ");
//        int a = sc.nextInt();
//        System.out.println("Enter second number : ");
//        int b = sc.nextInt();
        findLargest(30, 4);
        findLargest(6,9,12);
    }

    //function to find largest of 3 given numbers
    static void findLargest(int a, int b, int c) {
        System.out.println("Comparing for largest between " + a + ',' + b + "," + c);
        if (a > b && a > c) {
            System.out.println(a + " is largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }

    //function to find largest of 2 given numbers
    static void findLargest(int a, int b) {
        System.out.println("Comparing for largest between " + a + "," +b);
        if (a > b) {
            System.out.println(a + " is largest");
        } else {
            System.out.println(b + " is largest");
        }
    }
}



