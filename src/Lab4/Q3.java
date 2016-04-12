package Lab4;

  import java.util.Scanner;

  public class Q3 {
    public static void main (String[] args) {

      Scanner scanner = new Scanner(System.in);

      String[] words = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
      System.out.println("Words in list:");
      displayArray(words);

      System.out.println("Element to find?");
      String elementToFind = scanner.next();

      searchElement(words, elementToFind);
    }


    private static void displayArray(String array[]) {
      for (int n = 0; n < array.length; n++) {
        if (n < array.length - 1) {
          System.out.print(array[n] + ", ");
        } else {
          System.out.println(array[n]);
        }
      }
    }


    private static void searchElement(String array[], String elementToFind) {
      for (int i = 0; i < array.length; i++) {
        if (array[i].equals(elementToFind)) {
          System.out.println(elementToFind + " is at index " + i);
          return;
        }
      }
      System.out.println("That element was not found.");
    }
  }
