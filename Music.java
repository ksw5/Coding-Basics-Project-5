public class Music extends ServiceCommunicator{
    public static final MyApp userSong = new MyApp();
    private static String serviceURL = "https://itunes.apple.com/search?term=";

    public Music(MyApp userSong) {
        super( serviceURL + userSong + "&limit=1");

    }

    public static void getSong() {
        System.out.println("\n\n********** Your Song Facts **********");
        Music song = new Music(userSong);
        System.out.println(song.get());
    }


    /*
    Main method to test this class
     */
//    public static void main(String[] args) {
//        System.out.println(new Music("formation").get());
    }

