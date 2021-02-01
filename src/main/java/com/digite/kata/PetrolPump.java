package com.digite.kata;

import com.digite.kata.Vehicle;

public class PetrolPump {
    public void refuelVehicle(Vehicle vehicle, int fuelquantity) {
        int remainingFuel = vehicle.getRemainingFuel();
        int maxCapacity = vehicle.getMaxFuel();
        int totalFuel = remainingFuel + fuelquantity;
        if (totalFuel > maxCapacity){
            totalFuel = maxCapacity;
        }
        vehicle.setRemainingFuel(totalFuel);
    }
}
