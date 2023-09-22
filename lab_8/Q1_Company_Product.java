import java.util.Scanner;

interface Product {
    void display();

    static void calculateSales(String prodName, float price) {
        int count;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of \"" + prodName + "\" sold: ");
        count = sc.nextInt();
        System.out.println("Total sales amount = " + (count * price));
    }
}

class Hardware implements Product {
    String category, manufacturer;
    float price;

    Hardware() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product category and manufacturer: ");
        category = sc.next();
        manufacturer = sc.next();
        System.out.print("Enter price: ");
        price = sc.nextFloat();
    }

    public void display() {
        System.out.print("\nCategory: " + category +
                "\nManufacturer: " + manufacturer);
    }
}

class Software implements Product {
    String software, os;
    float price;

    Software() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter software and os: ");
        software = sc.next();
        os = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextFloat();
    }

    public void display() {
        System.out.print("\nSoftware: " + software +
                "\nOperating system: " + os);
    }

}

class Q1_Company_Product {
    public static void main(String[] args) {
        int hardwareCount = 2;
        int softwareCount = 3;

        Hardware hardware[] = new Hardware[hardwareCount];
        Software software[] = new Software[softwareCount];

        for (int i = 0; i < hardware.length; i++) {
            System.out.println("\nEnter hardware " + (i + 1) + " details:");
            hardware[i] = new Hardware();
        }
        for (int i = 0; i < hardware.length; i++) {
            hardware[i].display();
            Product.calculateSales(hardware[i].category, hardware[i].price);
        }

        System.out.println();
        for (int i = 0; i < software.length; i++) {
            System.out.println("\nEnter software " + (i + 1) + " details:");
            software[i] = new Software();
        }

        for (int i = 0; i < software.length; i++) {
            software[i].display();
            Product.calculateSales(software[i].software, software[i].price);
        }
        System.out.println();
    }
}
