public class ProxyImage implements Images{
    private LoadFullimage loadFullimage;
    private String filename;
    public ProxyImage(String filename){
        this.filename=filename;
    }

    public void displayLowImage() {
        System.out.println("Displaying low-quality images(through the proxy)"+filename);
    }
    public void displayFullImage() {
      if(loadFullimage == null){
          loadFullimage = new loadFullimage(filename);
      }
      loadFullimage.displayFullImage();
    }
}
