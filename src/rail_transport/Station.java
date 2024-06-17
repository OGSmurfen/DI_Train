package rail_transport;

public class Station {
    private String name;
    private Town town;
    private Coordinate coordinate;

    public Station(String name, Town town, Coordinate coordinate) {
        this.name = name;
        this.town = town;
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public Town getTown() {
        return town;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
