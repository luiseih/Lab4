package Lab4;

  import java.util.Scanner;
  import java.util.ArrayList;

  public class Q4 {
    public static void main (String[] args) {
      ArrayList <Integer> list = new ArrayList<>(100);
      Scanner scanner = new Scanner(System.in);

      for (int n = 1; n < 101; n++) {
        list.add(n);
      }

      displayArray(list);

      System.out.println();
      System.out.println("Remove elements which are multiples of: ");
      int divisor = scanner.nextInt();

      removeItems(list, divisor);

      displayArray(list);
    }


    private static void displayArray(ArrayList<Integer> list) {
      System.out.println();
      System.out.println("Array size: " + list.size());
      System.out.println("Numbers in list:");

      for (int n = 0; n < list.size(); n++) {
        if (n < list.size() - 1) {
          System.out.print(list.get(n) + ", ");
        } else {
          System.out.println(list.get(n));
        }
      }
    }


    private static void removeItems(ArrayList<Integer> list, int divisor) {
      for (int n = list.size() - 1; n > -1; n--) {
        if (list.get(n) % divisor == 0) {
          list.remove(n);
        }
      }
    }
  }
