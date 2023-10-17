import java.util.Scanner;

class NotSquareMatrixException extends Exception {
    private String msg;

    public NotSquareMatrixException() {
        msg = "Given matrix is NOT a square matrix as the number " +
                "of rows is not equal to the number of columns";
    }

    public NotSquareMatrixException(int rows, int cols) {
        msg = "Given matrix of order " + rows + " * " + cols +
                " is NOT a square matrix as the number  of rows " +
                "is not equal to the number of columns";
    }

    public String getMessage() {
        return msg;
    }
}

class Q5_Matrix_Validation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            getMatrix(sc);
        } catch (NotSquareMatrixException e) {
            System.out.println("\nCaught NotSquareMatrixException: " + e.getMessage());
        } finally {
            System.out.println();
            sc.close();
        }
    }

    static void getMatrix(Scanner sc) throws NotSquareMatrixException {
        int rows, columns, matrix[][];

        System.out.print("\nEnter number of rows and columns: ");
        rows = sc.nextInt();
        columns = sc.nextInt();

        if (rows != columns)
            throw new NotSquareMatrixException(rows, columns);

        matrix = new int[rows][columns];

        System.out.println("\nEnter matrix:");
        for (int[] row : matrix)
            for (int i = 0; i < columns; i++)
                row[i] = sc.nextInt();

        System.out.println("\nPrinting verified square matrix:");
        for (int[] row : matrix) {
            for (int cell : row)
                System.out.print(cell + "\t");
            System.out.println();
        }
    }
}
