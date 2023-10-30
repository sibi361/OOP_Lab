import java.util.Scanner;

interface Mark {
    void dispMark();
}

class NegativeMarkException extends Exception {
    public String toString() {
        return "Marks cannot be negative";
    }
}

class OutOfRangeException extends Exception {
    public String toString() {
        return "Marks cannot exceed 100";
    }
}

class Student implements Mark {
    long regno;
    String name, category;
    int m1, m2, m3, avg;
    char grade;

    void input(Scanner sc) throws NegativeMarkException, OutOfRangeException {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter regno: ");
        regno = sc.nextLong();
        System.out.print("Enter category: ");
        category = sc.next();

        System.out.print("Enter marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        if (m1 < 0 || m2 < 0 || m3 < 0)
            throw new NegativeMarkException();

        if (m1 > 100 || m2 > 100 || m3 > 100)
            throw new OutOfRangeException();

        avg = findAverage();
        grade = findGrade();
    }

    public void dispMark() {
        System.out.println("\nName: " + name + "\nRegno: " + regno +
                "\nMarks in 3 subjects: " + m1 + " " + m2 + " " + m3 +
                "\nAverage: " + avg + "\nGrade: " + grade);
    }

    int findAverage() {
        return (m1 + m2 + m3) / 3;
    }

    char findGrade() {
        if (avg > 80)
            return 'A';
        else if (avg > 60)
            return 'B';
        else if (avg > 40)
            return 'C';
        else if (avg > 20)
            return 'D';
        else
            return 'E';
    }
}

class Q3_Result_Processing {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        boolean valid = false, swapped = false;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        Student st_array[] = new Student[n];

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details of student " + (i + 1) + ":");
                st_array[i] = new Student();
                st_array[i].input(sc);
                valid = true;
            }
        } catch (NegativeMarkException e) {
            System.out.println("Caught " + e.getClass().getSimpleName() + ":");
            System.out.println(e);
        } catch (OutOfRangeException e) {
            System.out.println("Caught " + e.getClass().getSimpleName() + ":");
            System.out.println(e);
        } finally {
            sc.close();
        }

        if (!valid)
            System.exit(0);

        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (st_array[j].avg < st_array[j + 1].avg) {
                    Student temp = st_array[j];
                    st_array[j] = st_array[j + 1];
                    st_array[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped)
                break;
        }

        System.out.println("\nDisplaying top 3:");
        for (int i = 0; i < n && i < 3; i++) {
            st_array[i].dispMark();
        }

        System.out.println();
    }
}
