import java.util.*;

public class MyApp {
    public static String userZipcode;
    public static String userTvShow;
    public static String userSong;
    public static void main (String[] argv) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("Welcome to Kieran's Information Station!!");
        System.out.println("Enter your requests and I will display information on that request!");
        System.out.println("==========================================");

        System.out.print("Enter a zipcode >> ");
        userZipcode = input.nextLine();
        System.out.print("Enter a tv show (use plus [+] signs instead of spaces) >> ");
        userTvShow = input.nextLine();
        System.out.print("Enter a song title (use hyphens [-] instead of spaces) >> ");
        userSong = input.nextLine();
        input.close();
        Music.show();
    }
}