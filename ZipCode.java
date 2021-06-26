public class ZipCode extends ServiceCommunicator {
    public String serviceURL;
    public String zipcode;


    public ZipCode(String serviceURL, String zipcode) {
        super(serviceURL + zipcode);
        this.serviceURL = serviceURL;
        this.zipcode = zipcode;

    }
    public String getZipcode() {
        return this.serviceURL + this.zipcode;
    }

    /*
    Main method to test this class
     */
    public static void main(String[] argv) {
        System.out.println(new ZipCode("http://api.zippopotam.us/us/", "10011").get());
        System.out.println(new ZipCode("http://api.zippopotam.us/us/", "28211").get());
    }
}
