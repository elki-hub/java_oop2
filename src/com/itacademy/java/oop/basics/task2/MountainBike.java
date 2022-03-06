package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;

    private final static int MAX_GEAR = 20;
    private final static int MIN_GEAR = 0;
    private final static int MAX_SPEED = 100;
    private final static int MIN_SPEED = -10;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void applyBrakes(int decrease) {
        if (decrease < 0) {
            throw new IllegalArgumentException("Braking value can't be negative!");
        }
        if (speed - decrease < MIN_SPEED) {
            throw new IllegalArgumentException("Value is too high to brake. Highest possible speed to decrease is " + (speed - MIN_SPEED));
        }
        speed -= decrease;
        System.out.println("Current speed: " + speed);
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Increment value can't be negative!");
        }
        if (speed + increment > MAX_SPEED) {
            throw new IllegalArgumentException("Value is too high to increase bike speed. Highest possible speed to increase is " + (MAX_SPEED - speed));
        }
        speed += increment;
        System.out.println("Current speed: " + speed);
    }

    @Override
    public void changeGear(int newGear) {
        if (-1 > newGear || 1 < newGear) {
            throw new IllegalArgumentException("Value is not allowed! Use 1 or -1 for changing gear");
        }
        if (gear + newGear < MIN_GEAR) {
            throw new IllegalArgumentException("Gear already reached it's minimum of " + MIN_GEAR);
        }
        if (gear + newGear > MAX_GEAR) {
            throw new IllegalArgumentException("Gear already reached it's maximum of" + MAX_GEAR);
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
