public class LoadFullimage implements Images{
    private String filename;

    public LoadFullimage(String filename) {
        this.filename = filename;
        LoadFromData();
    }
    private void LoadFromData(){
    System.out.println("loading full image"+filename);
    }

    public void displayLowImage() {
     System.out.println("Displaying low-quality images"+filename);
    }

    public void displayFullImage() {
     System.out.println("Displaying high-quality images:"+filename);
    }
}
