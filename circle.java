public class circle {
    
    double radius;

    circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        circle c1 = new circle(5.0);
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());
    }
}
