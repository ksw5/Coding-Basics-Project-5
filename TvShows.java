public class TvShows extends ServiceCommunicator{
    String serviceURL;
    String show;

    public TvShows(String serviceURL, String show) {
        super(serviceURL + show);
        this.serviceURL = serviceURL;
        this.show = show;
    }

    public static void main(String[] argv) {
        System.out.println(new TvShows("http://api.tvmaze.com/singlesearch/shows?q=", "Family+Matters").get());
        System.out.println(new TvShows("http://api.tvmaze.com/singlesearch/shows?q=", "blackish").get());
    }
}
