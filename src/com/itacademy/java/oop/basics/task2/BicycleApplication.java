package com.itacademy.java.oop.basics.task2;

import java.util.Scanner;

public class BicycleApplication {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(0, 0);
        RoadBike roadBike = new RoadBike(0, 0);

        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();
        int round = 0;

        while(round < rounds){
            round ++;
            System.out.printf("\n----------------------- %d ROUND -----------------------\n", round);
            System.out.println("--------MOUNTAIN bike turn------");
            turn(mountainBike);
            System.out.println("--------ROAD bike turn------");
            turn(roadBike);

            System.out.printf("----------------------- The end of round %d  -----------------------\n", round);
            System.out.println(mountainBike);
            System.out.println(roadBike);
        }

        System.out.println("----------------------- THE END OF RACE  -----------------------");
        Speedometer speedometer = new Speedometer();
        System.out.printf("The winner is %s BIKE!!!", speedometer.chooseWinner(mountainBike, roadBike));
        //System.out.printf("The winner is %s BIKE!!!", speedometer.chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()));
    }

    public static void turn(Bicycle bike){
        System.out.print("Enter what you want to change (G - for changing gear / IS - To increase speed / DS - To decrease speed): ");
        String func = sc.nextLine();

        try{
            switch (func) {
                case "IS" -> increaseSpeed(bike);
                case "DS" -> decreasingSpeed(bike);
                case "G" -> changeGear(bike);
                default -> throw new Exeptions("Wrong input!");
            }
        }catch (Exeptions e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
            turn(bike);
        }


    }

    public static void increaseSpeed(Bicycle bike){
        System.out.println("Enter increasing speed: ");
        int speed = sc.nextInt();

        try {
            bike.speedUp(speed);
        }catch (Exeptions e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
            increaseSpeed(bike);
        }
    }

    public static void decreasingSpeed(Bicycle bike){
        System.out.println("Enter decreasing speed: ");
        int speed = sc.nextInt();

        try {
            bike.applyBrakes(speed);
        }catch (Exeptions e){
            System.out.println(e.getMessage());
            decreasingSpeed(bike);
        }
    }

    public static void changeGear(Bicycle bike){
        System.out.println("Enter gear changes: ");
        int newGear = sc.nextInt();

        try {
            bike.changeGear(newGear);
        }catch (Exeptions e){
            System.out.println(e.getMessage());
            changeGear(bike);
        }
    }


}
