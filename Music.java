import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Music extends ServiceCommunicator{
    static String songTitle;

    public Music(String serviceURL, String songTitle) {
        super( serviceURL + songTitle + "&limit=1");
        Music.songTitle = songTitle;
    }
    public static void getSong(String userSong) {
        System.out.println("\n\n********** Your Song Facts **********");
        Music song = new Music("https://itunes.apple.com/search?term=", userSong);
            //format json to gson pretty printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(song);
        System.out.println(prettyJson);
    }



    /*
    Main method to test this class
     */
//    public static void main(String[] args) {
//        System.out.println(new Music("formation").get());
    }

