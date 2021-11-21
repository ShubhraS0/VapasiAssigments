/* 2) Add 2 integers and concat 2 strings with same method name(Apply method Overriding) */

public class PolyConcatMethodOverloading {
    public static void main(String[] args) {

        add ( 3,4);
        add ( "Hello", "World" );
    }
    //method to add 2 integers
    public static void add(int i, int j) {
        int sum = i+j;
        System.out.println("Addition of given numbers " +i+ " & " + j + " is " +sum);
    }
    //method to concatenate 2 strings
    public static void add(String a, String b){
        String str = a + b;
        System.out.println("Combined String is " +str);
}
}