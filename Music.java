public class Music extends ServiceCommunicator{
    String serviceURL;
    String musicSearch;
    public Music(String serviceURL, String musicSearch) {
        super(serviceURL + musicSearch);
        this.serviceURL = serviceURL;
        this.musicSearch = musicSearch;
    }

    public static void main(String[] args) {
        System.out.println(new ServiceCommunicator("https://itunes.apple.com/search?term=" + "formation" + "\\&limit=1").get());
        System.out.println(new ServiceCommunicator("https://itunes.apple.com/search?term=" + "bad" + "\\&limit=1").get());
    }
}
