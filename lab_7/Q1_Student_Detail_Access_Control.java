import java.util.Scanner;

class Student_Detail {
    final static String college_name = "MIT";
    private String name; // demonstrating access control
    private long id;

    Student_Detail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student id: ");
        id = sc.nextLong();
        sc.close();
    }

    void display_details() {
        System.out.println("\nStudent name: " + name +
                "\nStudent id: " + id);
    }
}

class Q1_Student_Detail_Access_Control {
    public static void main(String args[]) {
        // demonstrating retrieval of static data member
        System.out.println("Taking input about \"" +
                Student_Detail.college_name +
                "\" college\n");

        Student_Detail student = new Student_Detail();
        student.display_details();
    }
}