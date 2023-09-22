import java.util.Scanner;

interface Sports {
    void setNumberOfGoals();

    void getNumberOfGoals();

    void dispTeam();
}

class Hockey implements Sports {
    int goals;
    String name;

    Hockey() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter team name: ");
        name = sc.nextLine();
    }

    public void setNumberOfGoals() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of goals for team " + name + ": ");
        goals = sc.nextInt();
    }

    public void getNumberOfGoals() {
        System.out.println("Goals: " + goals);
    }

    public void dispTeam() {
        System.out.println("\nTeam name: " + name);
    }

    static void findWinner(Hockey t1, Hockey t2) {
        System.out.println("\nFinding hockey winner");
        if (t1.goals > t2.goals)
            System.out.println("Team " + t1.name + " won by " + (t1.goals - t2.goals) +
                    " goals");
        else if (t1.goals < t2.goals)
            System.out.println("Team " + t2.name + " won by " + (t2.goals - t1.goals) +
                    " goals");
        else
            System.out.println("Team " + t1.name + " and Team " + t2.name + " tied with " +
                    t1.goals + " goals");
    }
}

class Football implements Sports {
    int goals;
    String name;

    Football() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter team name: ");
        name = sc.nextLine();
    }

    public void setNumberOfGoals() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of goals for team " + name + ": ");
        goals = sc.nextInt();
    }

    public void getNumberOfGoals() {
        System.out.println("Goals: " + goals);
    }

    public void dispTeam() {
        System.out.println("\nTeam name: " + name);
    }

    static void findWinner(Football t1, Football t2) {
        System.out.println("\nFinding football winner");
        if (t1.goals > t2.goals)
            System.out.println("Team " + t1.name + " won by " + (t1.goals - t2.goals) +
                    " goals");
        else if (t1.goals < t2.goals)
            System.out.println("Team " + t2.name + " won by " + (t2.goals - t1.goals) +
                    " goals");
        else
            System.out.println("Team " + t1.name + " and Team " + t2.name + " tied with " +
                    t1.goals + " goals");
    }
}

class A3_Hockey_Football {
    public static void main(String[] args) {
        System.out.println("Enter hockey team details: ");
        Hockey h_team1 = new Hockey();
        h_team1.setNumberOfGoals();
        h_team1.dispTeam();
        h_team1.getNumberOfGoals();

        Hockey h_team2 = new Hockey();
        h_team2.setNumberOfGoals();
        h_team2.dispTeam();
        h_team2.getNumberOfGoals();

        Hockey.findWinner(h_team1, h_team2);

        System.out.println("\nEnter football team details: ");

        Football f_team1 = new Football();
        f_team1.setNumberOfGoals();
        f_team1.dispTeam();
        f_team1.getNumberOfGoals();

        Football f_team2 = new Football();
        f_team2.setNumberOfGoals();
        f_team2.dispTeam();
        f_team2.getNumberOfGoals();

        Football.findWinner(f_team1, f_team2);

        System.out.println();
    }
}
