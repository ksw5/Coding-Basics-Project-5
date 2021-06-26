public class MyApp {
  public static void main (String[] argv) {
      java.util.Scanner userinput;

      while (true) {
          System.out.print("Enter you favorite song>> ");
          userinput = new java.util.Scanner(System.in);
          String cmd = userinput.next();
          System.out.println("You selected " + cmd + ".");
      }
  }
}