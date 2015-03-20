package homework2;

import java.util.Scanner;

/**
 * Implement a class named QuadraticEquation for a quadratic equation ax^2 + bx + x = 0. The class
 * contains: Private data fields a, b, and c that represent three coefficients.
 * A constructor for the arguments for a, b, and c. Three getter methods for a,
 * b, and c. A method named getDiscriminant() that returns the discriminant,
 * which is b2 - 4ac. The methods named getRoot1() and getRoot2() for returning
 * two roots. Let these methods return 0 if the discriminant is negative. Write
 * a test program that prompts the user to enter values for a, b, and c and
 * displays the result based on the discriminant. If the discriminant is
 * positive, display the two roots. If the discriminant is 0, display the one
 * root. Otherwise, display “The equation has no roots.”
 **/
public class QuadraticEquationTest {
public static class QuadraticEquation
{
  private double a;
  private double b;
  private double c;

  public QuadraticEquation(double paramA, double paramB, double paramC)
  {
    this.a = paramA;
    this.b = paramB;
    this.c = paramC;
  }

  double getA() {
    return this.a;
  }

  double getB() {
    return this.b;
  }

  double getC() {
    return this.c;
  }

  double getDiscriminant() {
    return this.b * this.b - 4.0 * this.a * this.c;
  }

  double getRoot1() {
    if (getDiscriminant() < 0.0) {
      return 0.0;
    }
    return (-this.b + getDiscriminant()) / (2.0 * this.a);
  }

  double getRoot2()
  {
    if (getDiscriminant() < 0.0) {
      return 0.0;
    }
    return (-this.b - getDiscriminant()) / (2.0 * this.a);
  }
}

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter coefficient a: ");
    double a = input.nextDouble();
    System.out.print("Enter coefficient b: ");
    double b = input.nextDouble();
    System.out.print("Enter coefficient c: ");
    double c = input.nextDouble();
    input.close();
    QuadraticEquation quadEquation = new QuadraticEquation(a, b, c);
    double discriminant = quadEquation.getDiscriminant();

    if (discriminant < 0.0) {
      System.out.println("The equation has no roots");
    }
    else if (discriminant == 0.0)
    {
      System.out.println("The equation has one root " + quadEquation.getRoot1());
    }
    else
    {
      System.out.println("The equation has two roots " + quadEquation.getRoot1() + 
        " and " + quadEquation.getRoot2());
    }
  }
}

