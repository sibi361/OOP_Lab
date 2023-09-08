import java.util.Scanner;

class Result {
    int student_count, subject_count;
    int marks[][], total[], total_i = 0, marks_i = 0;

    Result(int st_count, int sub_count) {
        student_count = st_count;
        subject_count = sub_count;

        marks = new int[student_count][subject_count];
        total = new int[student_count];
    }

    void storeStudentMarks(int m1, int m2, int m3) {
        if (marks_i == student_count) {
            System.out.println("marks array is full");
            return;
        }

        marks[marks_i][0] = m1;
        marks[marks_i][1] = m2;
        marks[marks_i++][2] = m3;
    }

    void storeTotalMarks() {
        for (int i = 0; i < student_count; i++) {
            total[i] = 0;
            for (int j = 0; j < subject_count; j++)
                total[i] += marks[i][j];
        }
    }

    void findHighestMarks() {
        int largest_roll = 0;
        for (int i = 1; i < student_count; i++)
            if (total[i] > total[largest_roll])
                largest_roll = i;

        System.out.println("Highest marks scored by student " +
                (largest_roll + 1));
    }

}

class A1_Student_Results {
    public static void main(String args[]) {
        int STUDENT_COUNT, SUBJECT_COUNT;
        STUDENT_COUNT = SUBJECT_COUNT = 3;
        Result r = new Result(STUDENT_COUNT, SUBJECT_COUNT);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.print("Enter student " + (i + 1) + " marks as m1 m2 m3: ");
            r.storeStudentMarks(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        sc.close();

        r.storeTotalMarks();
        r.findHighestMarks();
    }
}
