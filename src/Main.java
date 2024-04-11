/** Main.java
 *  Version: 1.0
 *  Author: Tee Willie
 *  Course: ITEC 2150 Spring 2024
 *  Written: April 9, 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt user for first triangle side lengths
            System.out.println("Give me the sides of the sides of the first triangle:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            // Create first Triangle object
            Triangle triangle1 = new Triangle(side1, side2, side3);

            // Prompt user for second triangle side lengths
            System.out.println("Give me the sides of the second triangle:");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();

            // Create second Triangle object
            Triangle triangle2 = new Triangle(side1, side2, side3);

            // Close Scanner
            scanner.close();

            // Check validity of first triangle and print result
            System.out.println("Triangle 1 is valid: " + triangle1.checkSides());

            // Check validity of second triangle and print result
            System.out.println("Triangle 2 is valid: " + triangle2.checkSides());
        } catch (IllegalTriangleSideException e) {
            // Handle IllegalTriangleSideException
            System.out.println("IllegalTriangleSideException: " + e.getMessage());
        }
    }
}
