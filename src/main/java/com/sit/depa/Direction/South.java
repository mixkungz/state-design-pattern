package com.sit.depa.Direction;

import com.sit.depa.Location;
import com.sit.depa.Vehicle;

public class South implements Direction {
    private static final South SOUTH = new South();
    private South() {

    }
    public static South getInstance() {
        return SOUTH;
    }
    @Override
    public void turnLeft(Vehicle vehicle) {
        vehicle.setDirection(East.getInstance());
    }

    @Override
    public void turnRight(Vehicle vehicle) {
        vehicle.setDirection(West.getInstance());
    }

    @Override
    public void uTurn(Vehicle vehicle) {
        vehicle.setDirection(North.getInstance());
    }

    @Override
    public void move(int distance, Vehicle vehicle) {
        Location location = vehicle.getLocation();
        int newYAxis = location.getyAxis() - distance;
        location.setyAxis(newYAxis);
        vehicle.setLocation(location);
    }

    @Override
    public String getDirection() {
        return "SOUTH";
    }
}
