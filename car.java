public class car {
    int mileage;
    String brandName;
    void display()
    {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Mileage: " + mileage);

    }

public static void main(String[] args) {
        car c1 = new car();
        c1.brandName = "Toyota";
        c1.mileage = 15;
        c1.display();
        car c2 = new car();
        c2.brandName = "Honda";
        c2.mileage = 18;
        c2.display();
        car c3 = new car();
        c3.brandName = "Ford";
        c3.mileage = 12;
        c3.display();

    }
}
