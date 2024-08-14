import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    String queryString = "a=1&b=2&c=3";
    String[] queryStringBits = queryString.split("&");

    System.out.println(Arrays.toString(queryStringBits));
    /*
    for (String bit : queryStringBits) {
      System.out.println(bit); //okshosh(Arrays st. ildiy jakta)
    }
    */

    Arrays.stream(queryStringBits).forEach(System.out::println);
  }
}