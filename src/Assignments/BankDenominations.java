package Assignments;

public abstract class BankDenominations {
    //int amountInRs = 10000;
    //int denomination;

    public abstract int totalNotes();
}

class MyBank extends BankDenominations{
    //setting total bank value
    int amountInRs = 10000;
    int denomination;
    String bank;

    //constructor for MyBank
    public MyBank(String bankName, int denominations){
        bank = bankName;
        denomination = denominations;
    }
    //implementation of abstract method
    public int totalNotes(){
        return amountInRs / denomination;
    }
    //for printing the denomination information
    public void printNotes(){
        System.out.println("Total amount in " + bank + " is " + amountInRs + ", in notes of " + denomination + " : " + totalNotes());
    }
}

class BankDenominationsTest{
    public static void main(String[] args){
        //object creation & argument values for 3 banks
        MyBank citi = new MyBank("Citi", 100);
        citi.printNotes();

        MyBank sbi = new MyBank("SBI", 500);
        sbi.printNotes();

        MyBank hdfc = new MyBank("HDFC", 2000);
        hdfc.printNotes();
    }
}