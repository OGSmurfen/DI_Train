package rail_transport;

public class Town {
    private String name;
    private String postalCode;

    public Town(String name, String postalCode) {
        this.name = name;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
