package com.sit.depa;

import com.sit.depa.Direction.East;
import com.sit.depa.Direction.South;
import com.sit.depa.Direction.West;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    void testTurnLeftFromNorthShouldDirectionToWest(){
        Vehicle vehicle = new Vehicle();
        vehicle.turnLeft();
        Assert.assertEquals("WEST", vehicle.getDirection());
    }
    @Test
    void testTurnLeftFromWestShouldDirectionToSouth(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(West.getInstance());
        vehicle.turnLeft();
        Assert.assertEquals("SOUTH", vehicle.getDirection());
    }
    @Test
    void testTurnLeftFromSouthShouldDirectionToEast(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(South.getInstance());
        vehicle.turnLeft();
        Assert.assertEquals("EAST", vehicle.getDirection());
    }
    @Test
    void testTurnLeftFromEastShouldDirectionToNorth(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(East.getInstance());
        vehicle.turnLeft();
        Assert.assertEquals("NORTH", vehicle.getDirection());
    }

    @Test
    void testTurnRightFromNorthShouldDirectionToEast(){
        Vehicle vehicle = new Vehicle();
        vehicle.turnRigth();
        Assert.assertEquals("EAST", vehicle.getDirection());
    }
    @Test
    void testTurnRightFromWestShouldDirectionToNorth(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(West.getInstance());
        vehicle.turnRigth();
        Assert.assertEquals("NORTH", vehicle.getDirection());
    }
    @Test
    void testTurnRightFromSouthShouldDirectionToWest(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(South.getInstance());
        vehicle.turnRigth();
        Assert.assertEquals("WEST", vehicle.getDirection());
    }
    @Test
    void testTurnRightFromEastShouldDirectionToSouth(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(East.getInstance());
        vehicle.turnRigth();
        Assert.assertEquals("SOUTH", vehicle.getDirection());
    }

    @Test
    void testUturnFromNorthShouldDirectionToSouth(){
        Vehicle vehicle = new Vehicle();
        vehicle.uTurn();
        Assert.assertEquals("SOUTH", vehicle.getDirection());
    }
    @Test
    void testUturnFromSouthShouldDirectionToNorth(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(South.getInstance());
        vehicle.uTurn();
        Assert.assertEquals("NORTH", vehicle.getDirection());
    }
    @Test
    void testUturnFromWestShouldDirectionToEast(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(West.getInstance());
        vehicle.uTurn();
        Assert.assertEquals("EAST", vehicle.getDirection());
    }
    @Test
    void testUturnFromEastShouldDirectionToWest(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(East.getInstance());
        vehicle.uTurn();
        Assert.assertEquals("WEST", vehicle.getDirection());
    }

    @Test
    void testMoveFromNorthYAxisShouldBePosition(){
        Vehicle vehicle = new Vehicle();
        vehicle.move(9);
        Assert.assertEquals(9, vehicle.getLocation().getyAxis());
    }
    @Test
    void testMoveFromSouthYAxisShouldBeNegative(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(South.getInstance());
        vehicle.move(9);
        Assert.assertEquals(-9, vehicle.getLocation().getyAxis());
    }
    @Test
    void testMoveFromWestXAxisShouldBeNegative(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(West.getInstance());
        vehicle.move(9);
        Assert.assertEquals(-9, vehicle.getLocation().getxAxis());
    }
    @Test
    void testMoveFromEastXAxisShouldBePosition(){
        Vehicle vehicle = new Vehicle();
        vehicle.setDirection(East.getInstance());
        vehicle.move(9);
        Assert.assertEquals(9, vehicle.getLocation().getxAxis());
    }
}
