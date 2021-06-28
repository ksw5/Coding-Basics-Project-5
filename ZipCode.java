public class ZipCode extends ServiceCommunicator {
    static String userZipcode;

    public ZipCode(String serviceURL, String userZipcode) {
        super(serviceURL + userZipcode);
        MyApp.userZipcode = userZipcode;

    }

    public static void getZip(String userZipcode) {
        System.out.println("\n\n********** Your Zipcode Facts **********");
        ZipCode zip = new ZipCode("http://api.zippopotam.us/us/", userZipcode);
        System.out.println(zip.get());
    }







    /*
    Main method to test this class
     */
//    public static void main(String[] argv) {
//        System.out.println(new ZipCode("28211").get());

    }

