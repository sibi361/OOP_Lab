class Bike {
    int speedlimit = 30;

    void run() {
        System.out.println("speed limit is " + speedlimit);
    }

    void run(int speed) {
        if (speed > speedlimit)
            System.out.println("given speed of " + speed + " is greater than maximum limit of " + speedlimit);
        else if (speed == speedlimit)
            System.out.println("given speed of " + speed + " equals maximum limit of " + speedlimit);
        else
            System.out.println("given speed of " + speed + " is less than maximum limit of " + speedlimit);

    }
}

class Splendar extends Bike {
    Splendar() {
        speedlimit = 50;
    }

    void type() {
        System.out.println("speed limit is " + speedlimit);
    }
}

class A2_Bike {
    public static void main(String args[]) {
        Bike bike = new Bike();
        Splendar spl = new Splendar();

        bike.run();
        bike.run(40);
        bike.run(20);

        System.out.println();
        spl.run();
        spl.run(40);
        spl.run(20);
    }
}