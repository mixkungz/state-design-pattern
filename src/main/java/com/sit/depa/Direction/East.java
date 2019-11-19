package com.sit.depa.Direction;

import com.sit.depa.Location;
import com.sit.depa.Vehicle;

public class East implements Direction {
    private static final East EAST = new East();
    private East() {

    }
    public static East getInstance() {
        return EAST;
    }


    @Override
    public void turnLeft(Vehicle vehicle) {
        vehicle.setDirection(North.getInstance());
    }

    @Override
    public void turnRight(Vehicle vehicle) {
        vehicle.setDirection(South.getInstance());
    }

    @Override
    public void uTurn(Vehicle vehicle) {
        vehicle.setDirection(West.getInstance());
    }

    @Override
    public void move(int distance, Vehicle vehicle) {
        Location location = vehicle.getLocation();
        int newXAxis = location.getxAxis() + distance;
        location.setxAxis(newXAxis);
        vehicle.setLocation(location);
    }

    @Override
    public String getDirection() {
        return "EAST";
    }

}
