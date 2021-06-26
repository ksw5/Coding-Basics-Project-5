public class TvShows extends ServiceCommunicator {
    private static final MyApp userTvShow = new MyApp();

    public TvShows(MyApp userTvShow) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + userTvShow);
    }

    public static void getShow() {
        System.out.println("/n********** Your TV Show Facts **********");
        TvShows show = new TvShows(userTvShow);
        System.out.println(show.get());
    /*
    Main method to test this class
     */
//    public static void main(String[] argv) {
//        System.out.println(new TvShows("blackish").get());
//        System.out.println(new TvShows("family+matters").get());
    }
}

