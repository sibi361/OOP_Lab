import java.util.Scanner;

class Parent {
    void sort() {
    }

    String getName() {
        return "";
    }

    String getData() {
        return "";
    }
}

class Employee extends Parent {
    String name;
    int YoE;

    Employee(Scanner sc) {
        System.out.print("\nEnter employee name: ");
        name = sc.next();
        System.out.print("Enter year of employment: ");
        YoE = sc.nextInt();
    }

    public String toString() {
        return name + "\t " + YoE;
    }

    String getName() {
        return name;
    }

    String getData() {
        return String.valueOf(YoE);
    }

    static Employee[] getData(Scanner sc, int n) {
        Employee[] temp = new Employee[n];

        for (int i = 0; i < n; i++) {
            temp[i] = new Employee(sc);
        }

        return temp;
    }
}

class Student extends Parent {
    String name;
    char grade;

    Student(Scanner sc) {
        System.out.print("\nEnter student name: ");
        name = sc.next();
        System.out.print("Enter student grade: ");
        grade = sc.next().charAt(0);

    }

    public String toString() {
        return name + "\t " + grade;
    }

    String getName() {
        return name;
    }

    String getData() {
        return String.valueOf(grade);
    }

    static Student[] getData(Scanner sc, int n) {
        Student[] temp = new Student[n];

        for (int i = 0; i < n; i++) {
            temp[i] = new Student(sc);
        }

        return temp;
    }
}

class SortUtility<T extends Parent> {
    T[] arr;

    SortUtility(T[] obj) {
        this.arr = obj;
    }

    void display() {
        System.out.println("Name\tData");
        for (T obj : arr)
            System.out.println(obj.toString());
    }

    void sort() {
        // bubble sort
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(arr[j].getData(), arr[j + 1].getData()) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    static <V extends Comparable> int compare(V a, V b) {
        return a.compareTo(b);
    }
}

class Q1_SortUtility {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter 1 for employee, 2 for students: ");
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Enter number of employees: ");
                Employee empArray[] = Employee.getData(sc, sc.nextInt());

                SortUtility<Employee> suEmployee = new SortUtility<Employee>(empArray);

                System.out.println("\n\nBefore sorting:");
                suEmployee.display();
                suEmployee.sort();
                System.out.println("\n\nAfter sorting:");
                suEmployee.display();

                break;

            case 2:
                System.out.print("Enter number of students: ");
                Student studArray[] = Student.getData(sc, sc.nextInt());

                SortUtility<Student> suStudent = new SortUtility<Student>(studArray);

                System.out.println("\n\nBefore sorting:");
                suStudent.display();
                suStudent.sort();
                System.out.println("\n\nAfter sorting:");
                suStudent.display();

                break;

            default:
                System.out.println("Invalid option");
                break;
        }

        System.out.println();
        sc.close();
    }
}
