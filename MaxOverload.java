public class MaxOverload {
    public void max(int a, int b) {
        System.out.println("Max of two integers: " + Math.max(a, b));
    }

    public void max(double a, double b) {
        System.out.println("Max of two doubles: " + Math.max(a, b));
    }

    public void max(int a, int b, int c) {
        System.out.println("Max of three integers: " + Math.max(a, Math.max(b, c)));
    }

    public static void main(String[] args) {
        MaxOverload obj = new MaxOverload();
        obj.max(10, 20);
        obj.max(10.5, 20.5);
        obj.max(10, 20, 30);
    }
}
