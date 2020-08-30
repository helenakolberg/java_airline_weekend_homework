public class FlightManager {

    public double baggageAllowancePerPassenger(Flight flight) {
        double totalAllowance = flight.getPlane().getWeight() / 2.0;
        double allowancePerPassenger = totalAllowance / flight.getPlane().getCapacity();
        return allowancePerPassenger;
    }
}
