public class MethodO {
    public void add(int a,int b)
{
    System.out.println(a+b);
}
public void add(int a,int b,int c)
{
    System.out.println(a+b+c);
}
public void add(double a,double b)
{
    System.out.println(a+b);
}
public static void main(String[] args)
{
    MethodO a = new MethodO();
    a.add(5,6);
    a.add(5,6,7);

    a.add(5.5,6.6);
}

}
