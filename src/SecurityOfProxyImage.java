public class SecurityOfProxyImage implements Images{
    private LoadFullimage loadFullimage;
    private String filename;
    private boolean LoggedIn;
    public SecurityOfProxyImage(String filename, boolean LoggedIn){
        this.filename=filename;
        this.LoggedIn=LoggedIn;
    }
    public void displayLowImage() {
        System.out.println("Displaying low-quality images(through the Protection Proxy)"+filename);
    }

    @Override
    public void displayFullImage() {
        if(!LoggedIn){
            System.out.println("Error user");
            return;
        }
        if (loadFullimage==null){
            loadFullimage = new LoadFullimage(filename);
        }
        loadFullimage.displayFullImage();
    }
}
