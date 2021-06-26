import java.util.*;

public class MyApp {
    public static void main (String[] argv) {
        informationStation();
    }

    public static void informationStation() {
        String userZipcode;
        String userTvShow;
        String userSong;

        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("Welcome to Kieran's Information Station!!");
        System.out.println("Enter your requests and I will display information on that request!");
        System.out.println("==========================================");

                // take user input for information
        System.out.print("Enter a zipcode >> ");
        userZipcode = input.nextLine();
        System.out.print("Enter a tv show >> ");
        userTvShow = input.nextLine().replaceAll("\\s", "+");
        System.out.print("Enter a song title >> ");
        userSong = input.nextLine().replaceAll("\\s", "-");
        input.close();

            // print all of the answers in string format
        ZipCode.getZip(userZipcode);
        TvShows.getShow(userTvShow);
        Music.getSong(userSong);

    }



}