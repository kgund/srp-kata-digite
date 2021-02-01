package com.digite.kata;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        vehicle = new Vehicle(10);
    }

    @Test
    public void testCapacity() {
        Assertions.assertEquals(10, vehicle.getMaxFuel());
    }

    @Test
    public void testRefuelCarWithinCapacity() {

        PetrolPump pump = new PetrolPump();
        pump.refuelVehicle(vehicle, 5);
        Assertions.assertEquals(5, vehicle.getRemainingFuel());
    }

    @Test
    public void testFuelReducesOnAcceleration(){
        PetrolPump pump = new PetrolPump();
        pump.refuelVehicle(vehicle, 5);
        vehicle.accelerate();
        Assertions.assertEquals(4, vehicle.getRemainingFuel());
    }

    @Test
    public void testRefuelCarWithExcessFuel() {

        PetrolPump pump = new PetrolPump();
        pump.refuelVehicle(vehicle, 5);
        vehicle.accelerate();
        pump.refuelVehicle(vehicle, 10);
        Assertions.assertEquals(10, vehicle.getRemainingFuel());
    }

}
