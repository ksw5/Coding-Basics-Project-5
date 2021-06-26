public class Music extends ServiceCommunicator{
    static String songTitle;

    public Music(String serviceURL, String songTitle) {
        super( serviceURL + songTitle + "&limit=1");
        Music.songTitle = songTitle;
    }
    public static void getSong(String userSong) {
        System.out.println("\n\n********** Your Song Facts **********");
        Music song = new Music("https://itunes.apple.com/search?term=", userSong);
        System.out.println(song.get());
    }


    //    static String showTitle;
//
//    public TvShows(String serviceURL, String showTitle) {
//        super(serviceURL + showTitle);
//        TvShows.showTitle = showTitle;
//    }
//    public static void getShow(String userTvShow) {
//        System.out.println("\n\n********** Your TV Show Facts **********");
//        TvShows show = new TvShows("http://api.tvmaze.com/singlesearch/shows?q=", userTvShow);
//        System.out.println(show.get());


    /*
    Main method to test this class
     */
//    public static void main(String[] args) {
//        System.out.println(new Music("formation").get());
    }

