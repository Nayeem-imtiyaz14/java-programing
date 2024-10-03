class Account 
{
    int balance;
    public Account(int initial_balance)
    {
        balance=initial_balance;
    }
    synchronized public void deposit(int amount)
    {
        System.out.println(Thread.currentThread().getName()+" is depositng "+ amount);
        balance+=amount;
        System.out.println("Balance after deposting "+balance);
    }
    synchronized public void withdrawl(int amount)
    {
        System.out.println(Thread.currentThread().getName()+" is withdrawing "+ amount);
        balance-=amount;
        System.out.println("Balance after withdrawing "+balance);
    }
    synchronized public void balance()
    {
        System.out.println(Thread.currentThread().getName()+" is checking balance");
        System.out.println("Balance "+balance);
    }
}
class deposit extends Thread 
{
    Account a;
    deposit(Account a)
    {
        this.a=a;
    }
    public void run()
    {
          a.deposit(1000);
    }
}
class withdrawl extends Thread 
{
    Account a;
    withdrawl(Account a)
    {
        this.a=a;
    }
    public void run()
    {
          a.withdrawl(500);
    }
}
class b extends Thread 
{
    Account a;
    b(Account a)
    {
        this.a=a;
    }
    public void run()
    {
        a.balance();
    }
}

public class bank {
    public static void main(String[] args) {
        
    
    Account a=new Account(1000);
   deposit d=new deposit(a);
   withdrawl w=new withdrawl(a);
   b bb=new b(a);
       d.start();
       w.start();
       bb.start();
    }
}
