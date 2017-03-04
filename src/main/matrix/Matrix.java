package main.matrix;

/**
 * Двумерная матрица
 */
public class Matrix
{
    private double[][] matrix;

    /**
     * Constructor
     *
     * @param matrix двумерный массив
     */
    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Умножение двух матриц
     *
     * @param m1 первая матрица
     * @param m2 вторая матрица
     * @return Результат перемножения
     */
    public static Matrix multiply(Matrix m1, Matrix m2) {
        /**
         * TODO: realize the matrix multiplication
         */
    }

    /**
     * Инвертирование матрицы (получение обратной матрицы)
     *
     * @param matrix Матрица
     * @return Обратная матрица
     */
    public static Matrix inverse(Matrix matrix) {
        /**
         * TODO: realize the matrix inverting
         */
    }
}
