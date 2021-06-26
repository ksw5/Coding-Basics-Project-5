public class ZipCode extends ServiceCommunicator {
    public String zipcode;
    public String serviceURL;

    public ZipCode(String serviceURL, String zipcode) {
        super(serviceURL + zipcode);
        this.zipcode = zipcode;
        this.serviceURL = serviceURL;
    }

    /*
    Main method to test this class
     */
    public static void main(String[] argv) {
        System.out.println(new ZipCode( URLstring + "10011"));
        System.out.println(new ServiceCommunicator("https://itunes.apple.com/search?term=" + "bbking" + "\\&limit=1").get());
        System.err.println("==================================");
        System.out.println(new ServiceCommunicator("http://www.google.com").get());
    }
}
