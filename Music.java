public class Music extends ServiceCommunicator{
    private static final MyApp userSong = new MyApp();
    public Music(MyApp userSong) {
        super("https://itunes.apple.com/search?term=" + userSong + "&limit=1");
    }

    public static void getSong() {
        System.out.println("/n********** Your Song Facts **********");
        Music song = new Music(userSong);
        System.out.println(song.get());
    }


    /*
    Main method to test this class
     */
//    public static void main(String[] args) {
//        System.out.println(new Music("formation").get());
    }

