// Create a class “BankAccount” with fields “accountNumber”, “balance”, and
// “interestRate” and a method “deposit()” that adds an amount to the balance.
// Create a subclass “SavingsAccount” that extends “BankAccount” and adds a
// field “minimumBalance” and a method “withdraw()” that subtracts an amount
// from the balance.ect of the “BankAccount” class and call the “deposit()”
// method. Create an object of the “SavingsAccount” class and call the
// “deposit()” and “withdraw()” methods.

import java.util.Scanner;

class BankAccount {
    int accountno;
     int balance;
    float interestrate;
    BankAccount(int a,int b,float c)
    {
        this.accountno=a;
        this.balance=b;
        this.interestrate=c;
    }
    public void deposit(int amount){
    balance=balance+amount;
    System.out.println(" After depositing ur balance is "+balance);
    }
}
class SavingAccount extends BankAccount{
    SavingAccount(int a,int b,float c)
    {
        super(a,b,c);
    }
    int minbalance;
    public void withdraw(int amount)
    {
        balance=balance-amount;
        System.out.println("After withdrawing ur balance is "+balance);
    }
}
class inheritance4{
    public static void main(String[] args) {
        System.out.println("Enter acc no,balance,rateofinterset ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Float c=sc.nextFloat();
     
        System.out.println("Enter the amount u want to withdrawl");
        int e=sc.nextInt();
        System.out.println("Enter the amount u want to deposit");
        int f=sc.nextInt();
        SavingAccount ss=new SavingAccount(a,b,c);
        ss.withdraw(e);

        ss.deposit(f);
    }
}