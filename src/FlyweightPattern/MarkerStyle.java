package FlyweightPattern;

public class MarkerStyle {
    private String icon;
    private String color;
    private String style;
    public MarkerStyle( String icon, String color, String style){
        this.icon=icon;
        this.color=color;
        this.style=style;
    }
    public void display(String location){
        System.out.println("Displaying marker at " + location + " Icon: " + icon + " Color: " + color + " Style: " + style );
    }
}
