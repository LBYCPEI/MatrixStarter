/*
 * File: Main.java
 * ---------------------
 * This class is a Matrix demo class
 * Author: Cobalt - mkc
 * Date modified: July 8, 2019
 */

import acm.program.*;

public class Main extends ConsoleProgram {

    public void run() {
        Matrix matrixA = null;
        Matrix matrixB = null;
        Matrix matrixC = null;
        int choice = 0;
        do {
            printMenu();
            choice = readInt(">> ");
            switch (choice) {

                case 0: // Input Matrix
                    println("matrixA: ");
                    matrixA = inputHelper();  // enclose in try-catch block (optional)
                    println("matrixB: ");
                    matrixB = inputHelper();
                    println("matrixA = ");
                    println(matrixA);
                    println("matrixB = ");
                    println(matrixB);
                    break;

                case 1: // Addition
                    if (matrixA == null || matrixB == null) {
                        println("Please input matrices first.");
                        break;
                    }
                    println("The sum of ");
                    println("matrixA = ");
                    println(matrixA);
                    println("and matrixB = ");
                    println(matrixB);
                    println(" is equal to ");
                    try {
                        matrixC = matrixA.add(matrixB);
                    } catch (Exception e) {
                        println(" --- INVALID OPERATION --- ");
                        e.printStackTrace();
                        break;
                    }
                    println(matrixC);
                    break;

                case 2: // Subtraction
                    if (matrixA == null || matrixB == null) {
                        println("Please input matrices first.");
                        break;
                    }
                    println("The difference of ");
                    println("matrixA = ");
                    println(matrixA);
                    println("and matrixB = ");
                    println(matrixB);
                    println(" is equal to ");
                    try {
                        matrixC = matrixA.subtract(matrixB);
                    } catch (Exception e) {
                        println(" --- INVALID OPERATION --- ");
                        e.printStackTrace();
                        break;
                    }
                    println(matrixC);
                    break;

                case 3: // Transpose
                    println("Input a matrix you want to transpose: ");
                    println("matrixD: ");
                    Matrix matrixD = inputHelper();
                    println("matrixD = ");
                    println(matrixD);
                    println("The transpose is: ");
                    matrixC = matrixD.transpose();
                    println(matrixC);
                    break;

                case 4: // Multiplication
                    if (matrixA == null || matrixB == null) {
                        println("Please input matrices first.");
                        break;
                    }
                    println("The product of ");
                    println("matrixA = ");
                    println(matrixA);
                    println("and matrixB = ");
                    println(matrixB);
                    println(" is equal to ");
                    try {
                        matrixC = matrixA.multiply(matrixB);
                    } catch (Exception e) {
                        println(" --- INVALID OPERATION --- ");
                        e.printStackTrace();
                        break;
                    }
                    println(matrixC);
                    break;

                case 5:
                    println("Exiting ....");
                    pause(1000);
                    exit();
                    break;
                default:
                    println("Invalid");
            }
        } while (choice != 5);
    }

    public void printMenu(){
        println("\n================================");
        println("           Main Menu    ");
        println("================================");
        println(" 0. Input Matrix   ");
        println(" 1. Addition   ");
        println(" 2. Subtraction ");
        println(" 3. Transpose ");
        println(" 4. Multiplication ");
        println(" 5. Exit ");
        println("================================\n");
    }

    private Matrix inputHelper() {
        println("Input the number of rows: ");
        int rows = readInt(">> ");
        println("Input the number of cols: ");
        int cols = readInt(">> ");
        if (rows == 0 || cols == 0)
            throw new RuntimeException("Illegal matrix dimensions.");
        double[][] result = new double[rows][cols];
        println("Input the elements: ");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                result[i][j] = readDouble("matrix[" + i + "][" + j + "] >> ");
            }
        return new Matrix(result);
    }

    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Main().start(args);
    }
}
