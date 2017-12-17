package com.company;

public class MatrixOperation implements IMatrixOperation {

    public void printMatrix(int[][] matrix) {
    }

    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max) {
        return new int[0][];
    }

    public int[][] multiplyWithScalar(int scalar, int[][] matrix) {
        /**Először megvizsgáltam, hogy a a mátrix üres-e, majd
         * inicializáltam egy scalarMatrix nevű új mátrixot,
         * a szorzat értékeinek tárolására.
         * For ciklusokkal végigjártam a mátrix elemeit és minden
         * elemét megszoroztam a scalár nevű változó értékével,
         * a kapott értékekkel feltöltöttem a scalarMatrix -ot*/
        if (matrix != null) {
            int[][] scalarMatrix = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    scalarMatrix[i][j] = matrix[i][j] * scalar;
                }
            }
            return scalarMatrix;
        } else return null;
    }

    public int[][] sum(int[][] matrixA, int[][] matrixB) {
        return new int[0][];
    }
}
