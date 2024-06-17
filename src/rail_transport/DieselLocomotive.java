package rail_transport;

public class DieselLocomotive extends Locomotive {

    @Override
    public double calculate() {
        return 8.5;
    }

    @Override
    public LocomotiveType getType() {
        return LocomotiveType.DIESEL;
    }
}
