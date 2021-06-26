public class ZipCode extends ServiceCommunicator {
    String zipcode;

    public ZipCode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
        this.zipcode = zipcode;
    }
    /*
    Main method to test this class
     */
//    public static void main(String[] argv) {
//        System.out.println(new ZipCode("28211").get());

    }

