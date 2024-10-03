interface  a
{
   void add();
   
} 
class b implements a{
    public void add()
    {
        System.out.println("nayeem");
    }
}
public class abstractclass {
                   public static void main(String[] args) {
                   a aa=new b();
                  aa.add();
                   }
}
