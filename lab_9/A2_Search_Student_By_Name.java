import java.util.Scanner;
import java.util.Random;

class Student {
    String firstName;
    String lastName;
    int registration_no;

    Student(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        registration_no = (new Random()).nextInt(221110000, 229990000);
    }

    String getName() {
        return firstName + " " + lastName;
    }
}

class A2_Search_Student_By_Name {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student stud_array[];
        String temp, query;
        boolean found = false;
        int n;

        n = 3;

        stud_array = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            stud_array[i] = new Student(sc.next(), sc.next());
        }

        // to read the newline on pressing enter
        // otherwise it will be read within loop
        sc.nextLine();

        System.out.print("Enter student name to search for: ");
        query = sc.nextLine();

        for (int i = 0; i < n; i++) {
            temp = stud_array[i].getName().toLowerCase();
            if (temp.indexOf(query) != -1) {
                found = true;
                System.out.println("\nStudent found\n" +
                        "Name: " + temp + "\nRegistration number: " +
                        stud_array[i].registration_no + "\n");
            }
        }

        if (!found)
            System.out.println("\nStudent named " + query + " NOT found.\n");

        sc.close();
    }
}