import java.util.Scanner;

class MarkOutofBoundsException extends Exception {
    private String msg;

    public MarkOutofBoundsException() {
        msg = "Marks of any subject should not exceed 100.";
    }

    public String getMessage() {
        return msg;
    }
}

class Student {
    private String name;
    private float m1, m2, m3;

    void getInput(Scanner sc) throws MarkOutofBoundsException {
        System.out.print("\nEnter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student marks in 3 subjects: ");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();
        if (m1 > 100 || m2 > 100 || m3 > 100)
            throw new MarkOutofBoundsException();
    }

    void showStatistics() {
        float percentage;
        System.out.println("\nStatistics of student with name: " + name);
        percentage = (m1 + m2 + m3) / 3;
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + getGrade(percentage));
    }

    char getGrade(float percentage) {
        if (percentage > 80)
            return 'A';
        else if (percentage > 60)
            return 'B';
        else if (percentage > 40)
            return 'C';
        else if (percentage > 20)
            return 'D';
        else
            return 'E';
    }
}

class A4_Student_Marks_Out_Of_Bounds {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        try {
            st.getInput(sc);
            st.showStatistics();
        } catch (MarkOutofBoundsException e) {
            System.out.println("\nCaught MarkOutofBoundsException: " + e.getMessage());
        } finally {
            System.out.println();
            sc.close();
        }
    }
}