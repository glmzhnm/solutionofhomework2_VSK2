import FlyweightPattern.MarketStyleFactory;
import FlyweightPattern.MarkerStyle;
import FlyweightPattern.MapMarker;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy Pattern Test:");
        Images proxyImage = new ProxyImage("dias.jpg");
        proxyImage.displayLowImage(); // Thumbnail
        proxyImage.displayFullImage(); // Loads
        proxyImage.displayFullImage(); // Already loaded
        System.out.println(" Protection Proxy Test:");
        Images protectedImage = new SecurityOfProxyImage("galymzhan.jpg", false);
        protectedImage.displayFullImage(); // Unauthorized access
        Images loadedImage = new SecurityOfProxyImage("berikzhan.jpg", true);
        loadedImage.displayFullImage(); // Allowed
      System.out.println("Flyweight Pattern Test:");
            List<MapMarker> markers = new ArrayList<>();
        for (int i = 0; i < 1001; i++) {
            String type;
            if (i % 3 == 0) {
                type = "Hospital";
            } else if (i % 3 == 1) {
                type = "Restaurant";
            } else {
                type = "Gas Station";
            }
            String icon = type.toLowerCase() + "-icon.png";
            String color;
            if (i % 3 == 0) {
                color = "Red";
            } else if (i % 3 == 1) {
                color = "Blue";
            } else {
                color = "Green";
            }
            String labelStyle = "Bold";
            markers.add(new MapMarker("Location " + i, icon, color, labelStyle));
        }
        for (int i = 0; i < 5; i++) {
        markers.get(i).display();
        }
        System.out.println("Unique styles: " + MarketStyleFactory.getStyleCount());
        System.out.println("Total markers: " + markers.size());
        }
}