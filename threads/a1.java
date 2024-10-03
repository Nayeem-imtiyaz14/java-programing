class printable 
{
    synchronized public void show(int x)
    {
        for(int i=1;i<=10;i++){
        System.out.println(x+"*"+i+"="+x*i);
        try 
        {
            Thread.sleep(1000);

        }
        catch(Exception e)
        {

        }
    }
}
}
class table1 extends Thread 
{
    printable t;
    table1(printable t)
    {
        this.t=t;
    }
    public void run()
    {
        t.show(2);
    }
}
class table2 extends Thread 
{
    printable t;
    table2(printable t)
    {
        this.t=t;
    }
    public void run()
    {
        t.show(3);
    }
}
class a1 
{
    public static void main(String[] args) {
        printable p=new printable();
        table1 t=new table1(p);
        table2 tt=new table2(p);
        t.start();
        tt.start();
    }
}