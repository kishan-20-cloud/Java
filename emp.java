public class emp {
	String name;
	int age;
	String role;

	emp(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public static void main(String[] args) {
		emp employee1 = new emp("Asha", 28, "HR");
		emp employee2 = new emp("Rahul", 30, "IT");
		emp employee3 = new emp("Priya", 26, "Accounts");

		System.out.println(employee1.name + " - " + employee1.age + " - " + employee1.role);
		System.out.println(employee2.name + " - " + employee2.age + " - " + employee2.role);
		System.out.println(employee3.name + " - " + employee3.age + " - " + employee3.role);
	}
}
