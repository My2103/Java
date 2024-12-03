//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class ComputeAngles {
    /**
     * @param args The argument for the program
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt three points from user
        System.out.print("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Compute the edge of the triangle
        double a = Math.sqrt(((x3-x2) * (x3-x2)) + ((y3-y2) * (y3-y2)));
        double b = Math.sqrt(((x3-x1) * (x3-x1)) + ((y3-y1) * (y3-y1)));
        double c = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));

        //Compute the angles of the triangle
        double A = Math.toDegrees(Math.acos((b*b + c*c - a*a)/(2*b*c)));
        double B = Math.toDegrees(Math.acos((a*a + c*c - b*b)/(2*a*c)));
        double C = Math.toDegrees(Math.acos((a*a + b*b - c*c)/(2*a*b)));

        System.out.println("The three angles are: " + Math.round(A *100)/100.0 + " "
                + Math.round(B *100)/100.0 + " " + Math.round(C *100)/100.0);

    }
}

