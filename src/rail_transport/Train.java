package rail_transport;

import java.util.Set;

public class Train {
    private Locomotive locomotive;
    private Set<Wagon> wagons;
    private Route route;

    public Train(Locomotive locomotive, Set<Wagon> wagons) {
        this.locomotive = locomotive;
        this.wagons = wagons;
    }
    public void addWagons(Wagon wagon){
        this.wagons.add(wagon);
    }
    public void removeWagons(Wagon wagon){
        this.wagons.remove(wagon);
    }
    public LocomotiveType getTrainType(Locomotive locomotive){
        return this.locomotive.getType();
    }
    public Route getRoute(){
        return this.route;
    }
    public void setRoute(Route route){
        this.route = route;
    }
    public double calculate(){
        double locomotiveValue = this.locomotive.calculate();
        double wagonsValue = locomotiveValue * this.wagons.size();
        double distanceSum = 0.0;

        while(this.route.hasNextStation()){
            distanceSum += this.route.getCurrentStation()
                    .getCoordinate().getDistance(
                            this.route.getNextStation().getCoordinate());
        }
        return locomotiveValue + wagonsValue * distanceSum;
    }

}
