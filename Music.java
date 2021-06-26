public class Music extends ServiceCommunicator{
    String songTitle;
    public Music(String songTitle) {
        super("https://itunes.apple.com/search?term=" + songTitle + "&limit=1");
        this.songTitle = songTitle;
    }
    /*
    Main method to test this class
     */
    public static void main(String[] args) {
        System.out.println(new Music("formation").get());
    }
}
