public class ZipCode extends ServiceCommunicator {
    public static final MyApp userZipcode = new MyApp();
    private static String serviceURL = "https://itunes.apple.com/search?term=";

    public ZipCode(MyApp userZipcode) {
        super(serviceURL + userZipcode);

    }

    public static void getZip() {
        System.out.println("\n\n********** Your Zipcode Facts **********");
        ZipCode zip = new ZipCode(userZipcode);
        System.out.println(zip.get());
    }







    /*
    Main method to test this class
     */
//    public static void main(String[] argv) {
//        System.out.println(new ZipCode("28211").get());

    }

