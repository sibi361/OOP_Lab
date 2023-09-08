import java.util.Scanner;

abstract class Student {
    long regno;
    String name;
    int age;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("Enter name regno and age: ");
        name = sc.next();
        regno = sc.nextLong();
        age = sc.nextInt();
    }

    void display() {
        System.out.println("\nName: " + name + "\nRegno: " + regno +
                "\nAge: " + age);
    }
}

class UG extends Student {
    int semester, fees;

    UG() {
        semester = 1;
        fees = 12345;
    }
}

class PG extends Student {
    int semester, fees;

    PG() {
        semester = 9;
        fees = 2345;
    }
}

class Q2_Student {
    public static void main(String args[]) {
        int ug_count, pg_count;
        // ug_count = pg_count = 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of UG and PG students: ");
        ug_count = sc.nextInt();
        pg_count = sc.nextInt();

        UG ug_students[] = new UG[ug_count];
        PG pg_students[] = new PG[pg_count];

        System.out.println("\nEnter UG student details:");
        for (int i = 0; i < ug_count; i++) {
            ug_students[i] = new UG();
            ug_students[i].getData();
        }

        System.out.println("\nEnter PG student details:");
        for (int i = 0; i < pg_count; i++) {
            pg_students[i] = new PG();
            pg_students[i].getData();
        }

        System.out.println("\nDisplaying UG student details:");
        for (int i = 0; i < ug_count; i++)
            ug_students[i].display();

        System.out.println("\nDisplaying PG student details:");
        for (int i = 0; i < pg_count; i++)
            pg_students[i].display();

        System.out.println("\nTotal UG admissions: " + ug_count);
        System.out.println("Total PG admissions: " + pg_count);

        sc.close();
    }
}
