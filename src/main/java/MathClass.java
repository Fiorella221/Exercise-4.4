import java.lang.Math;

import java.util.Scanner;

public class MathClass {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side : ");
    double side = input.nextDouble();

    double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
    System.out.println("Area of Hexagon is " + area);
    input.close();
  }
}


  












