package com.company;

public interface IMatrixOperation {

    void printMatrix(int[][] matrix);

    int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max);

    int[][] multiplyWithScalar(int scalar, int[][] matrix);

    int[][] sum(int[][] matrixA, int[][] matrixB);
}
