package rail_transport;

public class FreightWagon extends Wagon{
    @Override
    public WagonType getType() {
        return WagonType.FREIGHT;
    }
}
