package main;

import main.method.Point;

import java.io.PrintStream;
import java.util.Scanner;

public class Application
{
    private static final byte NUMBER_OF_POINTS = 4;

    private Point[] points;

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        this.readPoints();

        /**
         * TODO: calculating
         * TODO: writing result
         */
    }

    private void readPoints() {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        this.points = new Point[Application.NUMBER_OF_POINTS];
        for (int i = 0; i < Application.NUMBER_OF_POINTS; i++) {
            output.println("Point " + i);
            output.println("Enter x1:");
            double x1 = input.nextDouble();
            output.println("Enter x2:");
            double x2 = input.nextDouble();
            output.println("Enter y:");
            double y = input.nextDouble();
            this.points[i] = new Point(x1, x2, y);
            System.console().flush();
        }
    }
}
