import com.digite.kata.Vehicle;

public class PetrolPump {
    public void refuelVehicle(Vehicle vehicle, int fuelquantity) {
        int remainingFuel = vehicle.getRemainingFuel();
        vehicle.setRemainingFuel(remainingFuel + fuelquantity);
    }
}
