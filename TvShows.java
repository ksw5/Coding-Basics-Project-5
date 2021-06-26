public class TvShows extends ServiceCommunicator{
    String show;
    String serviceURL;
    public TvShows(String serviceURL, String show) {
        super(serviceURL);
        this.serviceURL = serviceURL;
        this.show = show;
    }
}
