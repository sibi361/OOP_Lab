class Bike {
    int speedlimit;

    Bike() {
        speedlimit = 30;
    }

    void run() {
        System.out.println("speed limit of normal bike is " +
                speedlimit + "\n");
    }
}

class Splendar extends Bike {
    Splendar() {
        speedlimit = 50;
    }

    void run() {
        System.out.println("speed limit of Splendar bike is " +
                speedlimit + "\n");
    }
}

class A2_Bike {
    public static void main(String args[]) {
        Bike bike = new Bike();
        Splendar splendar = new Splendar();

        bike.run();
        bike = splendar;
        bike.run(); // runtime polymorphism or dynamic method dispatch
    }
}
