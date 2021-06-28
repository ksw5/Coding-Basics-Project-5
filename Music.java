import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Music extends ServiceCommunicator{
    public static final MyApp userSong = new MyApp();
    private static String serviceURL = "https://itunes.apple.com/search?term=";

    public Music(MyApp userSong) {
        super( serviceURL + userSong + "&limit=1");

    }

    public static void getSong() {
        System.out.println("\n\n********** Your Song Facts **********");
<<<<<<< HEAD
        Music song = new Music("https://itunes.apple.com/search?term=", userSong);
            //format json to gson pretty printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(song);
        System.out.println(prettyJson);
    }



=======
        Music song = new Music(userSong);
        System.out.println(song.get());
    }


>>>>>>> parent of 062143e (updated rest of classes with new code fix)
    /*
    Main method to test this class
     */
//    public static void main(String[] args) {
//        System.out.println(new Music("formation").get());
    }

