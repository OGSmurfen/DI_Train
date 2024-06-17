package rail_transport;

public class PassengerWagon extends Wagon{
    @Override
    public WagonType getType() {
        return WagonType.PASSENGER;
    }
}
