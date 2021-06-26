public class TvShows extends ServiceCommunicator{


    private final MyApp userTvShow = new MyApp();

    public TvShows(MyApp userTvShow) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + userTvShow);
    }
    /*
    Main method to test this class
     */
//    public static void main(String[] argv) {
//        System.out.println(new TvShows("blackish").get());
//        System.out.println(new TvShows("family+matters").get());
    }

