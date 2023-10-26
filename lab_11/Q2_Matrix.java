import java.util.Scanner;

class NotSquareMatrixException extends Exception {
    private String msg;

    public NotSquareMatrixException() {
        msg = "Given matrix is NOT a square matrix";
    }

    public NotSquareMatrixException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

class MatrixDisplay extends Thread {
    MatrixDisplay(int matrix[][]) {
        System.out.println("\nPrinting matrix:");
        for (int[] row : matrix) {
            for (int cell : row)
                System.out.print(cell + "\t");
            System.out.println();
        }
    }
}

class MatrixTranspose extends Thread {
    MatrixTranspose(int matrix[][]) throws NotSquareMatrixException {
        if (matrix.length != matrix[0].length)
            throw new NotSquareMatrixException(
                    "\nTranpose can be printed for square matrix only");
        else {
            System.out.println("\nPrinting transpose of matrix:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++)
                    System.out.print(matrix[j][i] + "\t");
                System.out.println();
            }
        }
    }
}

class MatrixMaximum extends Thread {
    MatrixMaximum(int matrix[][]) {
        int max = matrix[0][0];
        for (int[] row : matrix)
            for (int cell : row)
                if (cell > max)
                    max = cell;
        System.out.println("\nMaximum value in matrix is = " + max);
    }
}

class MatrixPrincipalDiagonal extends Thread {
    MatrixPrincipalDiagonal(int matrix[][]) {
        System.out.println("\nPrincipal diagonal elements:");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (i == j)
                    System.out.print(matrix[i][j] + " ");
        System.out.println();
    }
}

class MatrixNonDiagonal extends Thread {
    MatrixNonDiagonal(int matrix[][]) {
        System.out.println("\nNon principal diagonal elements:");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (i != j)
                    System.out.print(matrix[i][j] + " ");
        System.out.println();
    }
}

class Q2_Matrix {
    static int[][] getMatrix(Scanner sc) {
        int rows, columns, matrix[][];

        System.out.print("\nEnter number of rows and columns: ");
        rows = sc.nextInt();
        columns = sc.nextInt();

        matrix = new int[rows][columns];

        System.out.println("\nEnter matrix:");
        for (int[] row : matrix)
            for (int i = 0; i < columns; i++)
                row[i] = sc.nextInt();

        return matrix;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = getMatrix(sc);

        new MatrixDisplay(mat).start();
        try {
            new MatrixTranspose(mat).start();
        } catch (NotSquareMatrixException e) {
            System.out.println("\nError in MatrixDisplay:\n" + e);
        }
        new MatrixMaximum(mat).start();
        new MatrixPrincipalDiagonal(mat).start();
        new MatrixNonDiagonal(mat).start();

        System.out.println();
        sc.close();
    }
}
