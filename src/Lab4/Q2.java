package Lab4;

  import java.util.Scanner;
  import java.util.Random;

  public class Q2 {
    public static void main (String[] args) {
      System.out.println("Size of List to Search?");
      Scanner scanner = new Scanner(System.in);
      int listSize = scanner.nextInt();
      int numbers[] = new int[listSize];

      Random randomGenerator = new Random();
      for (int n = 0; n < listSize; n++) {
        int r = randomGenerator.nextInt(100) + 1;
        numbers[n] = r;
      }

      System.out.println("Numbers in list:");
      displayArray(numbers);

      System.out.println("Element to find?");
      int elementToFind = scanner.nextInt();

      searchElement(numbers, elementToFind);
    }


    private static void displayArray(int array[]) {
      for (int n = 0; n < array.length; n++) {
        if (n < array.length - 1) {
          System.out.print(array[n] + ", ");
        } else {
          System.out.println(array[n]);
        }
      }
    }


    private static void searchElement(int array[], int elementToFind) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] == elementToFind) {
          System.out.println(elementToFind + " is at index " + i);
          return;
        }
      }
      System.out.println("That element was not found.");
    }
  }