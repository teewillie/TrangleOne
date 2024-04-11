/** Class: Triangle
 *  Version: 1.0
 *  Author: Tee Willie
 *  Course: ITEC 2150 Spring 2024
 *  Written: April 9, 2024
 */

public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleSideException("The of any two sides must be greater than the third side.");
        }
        return true;
    }
}
