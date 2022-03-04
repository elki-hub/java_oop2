package com.itacademy.java.oop.basics.task2;

public class Speedometer {
    Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            return Bike.MOUNTAIN;
        } else if (mountainBike.getSpeed() < roadBike.getSpeed())
            return Bike.ROAD;
        return null;
    }

    Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else if (mountainBikeSpeed < roadBikeSpeed)
            return Bike.ROAD;
        return null;
    }
}
