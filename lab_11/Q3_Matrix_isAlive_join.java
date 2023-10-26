import java.util.Scanner;

class MatrixDisplay extends Thread {
    MatrixDisplay(int matrix[][]) {
        System.out.println("\nPrinting matrix:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
            System.out.println();
        }
    }
}

class MatrixTranspose extends Thread {
    MatrixTranspose(int matrix[][]) {
        if (matrix.length != matrix[0].length) {
            System.out.println("\nTranpose can be printed only square matrix.");
        } else {
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
                    System.out.print(matrix[j][i] + " ");
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

class Q3_Matrix_isAlive_join {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = getMatrix(sc);

        Thread display = new MatrixDisplay(mat);
        Thread transpose = new MatrixTranspose(mat);
        Thread maximum = new MatrixMaximum(mat);
        Thread diagonal = new MatrixPrincipalDiagonal(mat);
        Thread nonDiagonal = new MatrixNonDiagonal(mat);

        display.start();
        System.out.println("\nThread display is alive before join(): " + display.isAlive());
        transpose.start();
        maximum.start();
        diagonal.start();
        nonDiagonal.start();

        try {
            display.join();
            System.out.println("\nThread display is alive after join(): " + display.isAlive());
            transpose.join();
            maximum.join();
            diagonal.join();
            nonDiagonal.join();
        } catch (InterruptedException e) {
        }

        System.out.println();
        sc.close();
    }

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
}
