package com.sit.depa.Direction;

import com.sit.depa.Vehicle;

public interface Direction {
    void turnLeft(Vehicle vehicle);
    void turnRight(Vehicle vehicle);
    void uTurn(Vehicle vehicle);
    void move(int distance, Vehicle vehicle);
    String getDirection();
}