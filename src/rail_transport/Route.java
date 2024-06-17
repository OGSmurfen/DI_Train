package rail_transport;

import java.util.List;

public class Route {
    private List<Station> stations;
    private Station currentStation;
    private int nextStationIndex;

    public Route(Station startStation) {
        this.currentStation = startStation;
        this.stations = StationMap.getRoute(this.currentStation);
        this.nextStationIndex = 0;
    }
    public Station getNextStation(){
        return this.stations.get(nextStationIndex++);
    }

    public Station getCurrentStation() {
        return currentStation;
    }
    public boolean hasNextStation(){
        return this.stations.size() > nextStationIndex;
    }
}
