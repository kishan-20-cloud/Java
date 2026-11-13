import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter array size
        System.out.print("Enter  size of the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Enter array elements
        System.out.println("Enter  array elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Find and display repeated elements
        System.out.println("\nRepeated elements:");

        for (int i = 0; i < n; i++) {

            int count = 1;

            // Check if this element was already checked
            boolean alreadyChecked = false;

            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    alreadyChecked = true;
                    break;
                }
            }

            // Count occurrences
            if (!alreadyChecked) {

                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }

                // Display only repeated elements
                if (count > 1) {
                    System.out.println(array[i] + " is repeated " + count + " times");
                }
            }
        }

        // Create a new array for unique elements
        int[] unique = new int[n];
        int uniqueCount = 0;

        // Remove duplicates
        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Add only unique elements
            if (!isDuplicate) {
                unique[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Display array with unique values
        System.out.println("\nArray after removing duplicates:");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}