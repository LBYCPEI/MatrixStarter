/**
 * Matrix.java
 * Author: cobalt - mkc
 * Date created: July 8, 2019
 * Date modified: July 27, 2022
 */

public class Matrix {
    private int row; // number of matrix rows
    private int col; // number of matrix columns
    private double[][] data; // stores the elements

    /**
     * Constructor 1 : Creates the row x col matrix
     * @param row  // number of matrix rows
     * @param col  // number of matrix columns
     */
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        data = new double[row][col];
    }

    /**
     * Constructor 2 : Creates the row x col matrix from 2D array
     * @param data
     */
    public Matrix(double[][] data) {
        row = data.length;
        col = data[0].length;
        this.data = new double[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                this.data[i][j] = data[i][j];
            }
    }

    /**
     * Returns the number of rows
     * @return
     */
    public int getRow() {
        return row;
    }

    /**
     * Returns the number of columns
     * @return
     */
    public int getCol() {
        return col;
    }


    /**
     * Returns the transpose of the Matrix
     * @return matrix transpose
     */
    Matrix transpose() {
        if (row <= 0 || col <= 0)
            throw new RuntimeException("Illegal matrix dimensions.");
        Matrix result = new Matrix(col, row);
        // ********************************************
        // YOUR CODE HERE
        // ********************************************
        return result;
    }

    /**
     * Returns the sum of the Matrix
     * @param addend2
     * @return
     */
    Matrix add(Matrix addend2) {
        Matrix addend1 = this;
        if (addend1.row != addend2.row || addend1.col != addend2.col)
            throw new RuntimeException("Illegal matrix dimensions.");
        Matrix sum = new Matrix(row, col);
        // ********************************************
        // YOUR CODE HERE
        // ********************************************
        return sum;
    }

    Matrix subtract(Matrix subtrahend) {
        Matrix minuend = this;
        if (subtrahend.row != minuend.row || subtrahend.col != minuend.col)
            throw new RuntimeException("Illegal matrix dimensions.");
        Matrix difference = new Matrix(row, col);
        // ********************************************
        // YOUR CODE HERE
        // ********************************************
        return difference;
    }

    Matrix multiply(Matrix factor2) {
        Matrix factor1 = this;
        if (factor1.col != factor2.row) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix product = new Matrix(factor1.row, factor2.col);
        // ********************************************
        // YOUR CODE HERE
        // ********************************************
        // ********************************************
        return product;
    }

    /**
     * This method displays the current matrix
     * @return
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result.append(data[i][j]);
                result.append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
