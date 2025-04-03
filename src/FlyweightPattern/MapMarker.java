package FlyweightPattern;

public class MapMarker {
    private String location;
    private MarkerStyle style;

    public MapMarker(String location, String icon, String color, String labelStyle) {
        this.location = location;
        this.style = MarketStyleFactory.getStyle(icon, color, labelStyle);
    }

    public void display() {
        style.display(location);
    }
}
