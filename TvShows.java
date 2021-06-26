public class TvShows extends ServiceCommunicator{
    String showTitle;

    public TvShows(String showTitle) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + showTitle);
        this.showTitle = showTitle;
    }
    /*
    Main method to test this class
     */
    public static void main(String[] argv) {
        System.out.println(new TvShows("blackish").get());
        System.out.println(new TvShows("family+matters").get());
    }
}
