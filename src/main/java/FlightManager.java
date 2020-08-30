public class FlightManager {

    public double baggageAllowancePerPassenger(Plane plane) {
        double totalAllowance = plane.getWeight() / 2.0;
        double allowancePerPassenger = totalAllowance / plane.getCapacity();
        return allowancePerPassenger;
    }
}
