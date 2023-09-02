import java.util.Scanner;

class Employee {
    String name, city;
    float dearness_allowance;
    double basic_salary, house_rent_allowance, total_salary;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee details: Name: ");
        name = sc.next();
        System.out.print("Enter city: ");
        city = sc.next();
        System.out.print("Enter basic salary: ");
        basic_salary = sc.nextDouble();
        System.out.print("Enter dearness allowance %: ");
        dearness_allowance = sc.nextFloat();
        System.out.print("Enter house rent allowance: ");
        house_rent_allowance = sc.nextDouble();
        sc.close();
    }

    void calculate() {
        System.out.println("Calculating total salary");
        total_salary = basic_salary +
                basic_salary * dearness_allowance / 100 +
                basic_salary * house_rent_allowance / 100;
    }

    void display() {
        System.out.println("Total salary: " + total_salary);
    }
}

class Q2_Employee {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.getData();
        e.calculate();
        e.display();
    }
}
