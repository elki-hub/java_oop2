package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;

    private final int MAXGEAR = 20;
    private final int MINGEAR = 0;
    private final int MAXSPEED = 50;
    private final int MINSPEED = 0;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void applyBrakes(int decrease) {
        if (decrease > 0) {
            throw new Exeptions("Braking value can't be positive!");
        }
        if (speed - decrease < MINSPEED) {
            throw new Exeptions("Value is too high to brake. Highest possible speed to decrease is " + (-speed + MINSPEED));
        }
        speed += decrease;
        System.out.println("Current speed: " + speed);
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new Exeptions("Increment value can't be negative!");
        }
        if (speed + increment > MAXSPEED) {
            throw new Exeptions("Value is too high to increase bike speed. Highest possible speed to increase is " + (MAXSPEED - speed));
        }
        speed += increment;
        System.out.println("Current speed: " + speed);
    }

    @Override
    public void changeGear(int newGear) {
        if (-2 > newGear || 2 < newGear) {
            throw new Exeptions("Value is not allowed! Use 1, 2 or -1, -2 for changing gear");
        }
        if (gear + newGear < MINGEAR) {
            throw new Exeptions("Gear already reached it's minimum of " + MINGEAR);
        }
        if (gear + newGear > MAXGEAR) {
            throw new Exeptions("Gear already reached it's maximum of" + MAXGEAR);
        }
        gear += newGear;
        System.out.println("Current gear: " + gear);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                " gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
