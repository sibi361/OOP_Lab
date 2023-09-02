import java.util.Scanner;

class Time {
    int hour, minute, second;

    Time() {
        hour = minute = second = 0;
    }

    Time(int h, int m, int s) {
        int valid = 0;

        if (h < 0 || h > 23)
            System.out.println("Invalid hour: " + h + "\n");
        else if (m < 0 || m > 60)
            System.out.println("Invalid minute: " + m + "\n");
        else if (s < 0 || s > 60)
            System.out.println("Invalid second: " + s + "\n");
        else
            valid = 1;

        if (valid == 1) {
            hour = h;
            minute = m;
            second = s;
        } else
            System.exit(0);
    }

    static Time addTime(Time t1, Time t2) {
        int sec_1, sec_2, sec_sum, h, m, s;

        sec_1 = t1.hour * 3600 + t1.minute * 60 + t1.second;
        sec_2 = t2.hour * 3600 + t2.minute * 60 + t2.second;

        sec_sum = sec_1 + sec_2;
        if (sec_sum > 86400)
            sec_sum %= 86400;

        h = sec_sum / 3600;
        m = sec_sum % 3600 / 60;
        s = sec_sum % 3600 - m * 60;

        Time new_time = new Time(h, m, s);
        return new_time;
    }

    void displayTime() {
        if (Integer.toString(hour).length() == 2)
            System.out.print(hour);
        else
            System.out.print("0" + hour);

        System.out.print(":");
        if (Integer.toString(minute).length() == 2)
            System.out.print(minute);
        else
            System.out.print("0" + minute);

        System.out.print(":");
        if (Integer.toString(second).length() == 2)
            System.out.println(second);
        else
            System.out.println("0" + second);

        System.out.println();
    }
}

class Q3_Time {
    public static void main(String args[]) {
        Time time_1 = new Time();
        System.out.print("Time 1: ");
        time_1.displayTime();

        // Time time_2 = new Time(7, 20, 33);
        // Time time_3 = new Time(0, 0, 29);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time 2 as hour minute second: ");
        Time time_2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Time 2: ");
        time_2.displayTime();

        System.out.print("Enter Time 3 as hour minute second: ");
        Time time_3 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();

        System.out.print("Time 3: ");
        time_3.displayTime();

        System.out.print("Sum of Time 2 and Time 3: ");
        Time sum_t2_t3 = Time.addTime(time_2, time_3);
        sum_t2_t3.displayTime();
    }
}
