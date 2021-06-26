public class Music extends ServiceCommunicator{
    String songTitle;
    public static MyApp userSong;
    public Music(String songTitle) {
        super("https://itunes.apple.com/search?term=" + songTitle + "&limit=1");
        this.songTitle = songTitle;
    }
    public static String format() {
        System.out.println("\n---------- Song Information ----------\n" +
                "Song Title   | " + userSong + "\n");
        return null;
    }

    /*
    Main method to test this class
     */
    public static void main(String[] args) {
        System.out.println(new Music("formation").get());
    }
}
