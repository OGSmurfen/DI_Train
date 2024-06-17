package rail_transport;

public class SteamLocomotive extends Locomotive{
    @Override
    public double calculate() {
        return 9.5;
    }

    @Override
    public LocomotiveType getType() {
        return LocomotiveType.STEAM;
    }
}
