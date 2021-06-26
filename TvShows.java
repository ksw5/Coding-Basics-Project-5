public class TvShows extends ServiceCommunicator {
    static String showTitle;

    public TvShows(String serviceURL, String showTitle) {
        super(serviceURL + showTitle);
        TvShows.showTitle = showTitle;
    }

    public static void getShow() {
        System.out.println("\n\n********** Your TV Show Facts **********");
        TvShows show = new TvShows("http://api.tvmaze.com/singlesearch/shows?q=", showTitle);
        System.out.println(show.get());
    /*
    Main method to test this class
     */
//    public static void main(String[] argv) {
//        System.out.println(new TvShows("blackish").get());
//        System.out.println(new TvShows("family+matters").get());
    }
}

