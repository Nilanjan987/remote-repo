interface I1
{
   void display(int a);
}

interface I2
{
  void display(int a,int b);
}

class AB implements I1,I2
{

  public void display(int a)
  {
  System.out.println("1 parameter");
  }

    public void display(int a,int b)
  {
  System.out.println("2 parameter");
  }
 public static void main(String[] args)
  {
     A obj=new A();
     obj.display(2);
  }
}
