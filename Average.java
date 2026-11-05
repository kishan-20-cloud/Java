public class Average {
   public void add(double a , double b) {
    System.out.println((a+b)/2);
    }
    public void add (double a , double b, double c)
    {
        System.out.println((a+b+c)/3);}
    }
    public static void main (String[] args){
        Average a = new Average();
        a.add(91.2,92.4);
        a.add(90.1,99.2,93.4);
    }
