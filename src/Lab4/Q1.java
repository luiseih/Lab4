package Lab4;

  import java.util.Scanner;
  import java.util.Random;
  import java.util.Arrays;

  public class Q1 {
    public static void main(String[] args) {
      System.out.println("Size of array to sort?");
      Scanner scanner = new Scanner(System.in);
      int arraySize = scanner.nextInt();
      int[] numbers = new int[arraySize];

      Random randomGenerator = new Random();
      for (int n = 0; n < arraySize; n++) {
        int r = randomGenerator.nextInt(100) + 1;
        numbers[n] = r;
      }

      displayArray(numbers);

      Arrays.sort(numbers);

      displayArray(numbers);
    }


    public static void displayArray(int array[]) {
      for (int n = 0; n < array.length; n++) {
        if (n < array.length - 1) {
          System.out.print(array[n] + ", ");
        } else {
          System.out.println(array[n]);
        }
      }
    }
  }