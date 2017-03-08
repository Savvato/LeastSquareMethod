package main;

import main.matrix.Matrix;
import main.method.LeastSquareMethod;
import main.method.Point;

import java.util.Scanner;

public class Application
{
    private static final byte NUMBER_OF_POINTS = 4;

    private Point[] points;
    private Matrix result;

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        this.readPoints();
        this.calculateResult();
        this.writeResult();
    }

    /**
     * Чтение из консоли значений точек
     */
    private void readPoints() {
        Scanner input = new Scanner(System.in);
        this.points = new Point[Application.NUMBER_OF_POINTS];
        for (int i = 0; i < Application.NUMBER_OF_POINTS; i++) {
            System.out.println("==================================");
            System.out.println("Point " + (i + 1));
            System.out.print("Enter x1: ");
            double x1 = input.nextDouble();
            System.out.print("Enter x2: ");
            double x2 = input.nextDouble();
            System.out.print("Enter y: ");
            double y = input.nextDouble();
            this.points[i] = new Point(x1, x2, y);
        }
        System.out.println("==================================");
    }

    /**
     * Расчет результатов
     */
    private void calculateResult() {
        LeastSquareMethod method = new LeastSquareMethod(this.points);
        this.result = method.calculate();
    }

    /**
     * Вывод в консоль
     */
    private void writeResult() {
        System.out.println("============RESULT============");
        double[] result = this.result.getColumn(0);
        for (int i = 0; i < result.length; i++) {
            System.out.println("c" + (i + 1) + " = " + result[i]);
        }
    }
}
