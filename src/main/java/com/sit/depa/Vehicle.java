package com.sit.depa;

import com.sit.depa.Direction.Direction;
import com.sit.depa.Direction.North;

public class Vehicle {
    private Location location = new Location();
    private Direction direction = North.getInstance();

    public Vehicle() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDirection() {
        return direction.getDirection();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public void move(int distance) {
        direction.move(distance, this);
    }
    public void turnLeft(){
        direction.turnLeft(this);
    }
    public void turnRigth(){
        direction.turnRight(this);
    }
    public void uTurn(){
        direction.uTurn(this);
//        direction = direction.uTurn();
    }
}
