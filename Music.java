public class Music extends ServiceCommunicator{
    static String userSong;

    public Music(String serviceURL, String userSong) {
        super( serviceURL + userSong + "&limit=1");
        Music.userSong = userSong;

    }
    public static void getSong(String userSong) {
        System.out.println("\n\n********** Your Song Facts **********");
        Music song = new Music("https://itunes.apple.com/search?term=", userSong);
        System.out.println(song.get());
    }

    /*
    Main method to test this class
     */
//    public static void main(String[] args) {
//        System.out.println(new Music("formation").get());
    }

