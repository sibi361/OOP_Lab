import java.util.Scanner;

class Student {
    private String name;
    private long roll;
    private float m1, m2, m3;

    void getInput(Scanner sc) throws NumberFormatException {
        System.out.print("\nEnter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student roll number: ");
        roll = Long.parseLong(sc.next());
        System.out.print("Enter student marks in 3 subjects: ");
        m1 = Float.parseFloat(sc.next());
        m2 = Float.parseFloat(sc.next());
        m3 = Float.parseFloat(sc.next());
    }

    void showStatistics() {
        float percentage;
        System.out.println("\nStatistics of student with roll number: " + roll);
        System.out.println("Name: " + name);
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

class Q3_Student_Details_Parse_Calculate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        try {
            st.getInput(sc);
            st.showStatistics();
        } catch (NumberFormatException e) {
            System.out.println("\nInvalid input. Please enter a number.");
        } finally {
            System.out.println("\n");
            sc.close();
        }
    }
}