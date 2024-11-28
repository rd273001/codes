import java.util.*;

public class Unique_Elements_Ordered_With_Last_Index {
  // Input: [2, 1, 4, 5, 5, 6, 5, 7, 2]
  // Output: [1, 4, 6, 5, 7, 2]
  public static List<Integer> uniqueElements(int[] arr) {
    Map<Integer, Integer> arrIndexedMap = new HashMap<>();
    ArrayList<Integer> filteredList = new ArrayList<>();

    // Traverse the array from the end to the beginning
    for (int i = arr.length - 1; i >= 0; i--) {
      if (!arrIndexedMap.containsKey(arr[i])) {
        arrIndexedMap.put(arr[i], i);
        filteredList.add(arr[i]);
      }
    }

    // Reverse the filtered list to maintain the order of last occurrence
    Collections.reverse(filteredList);
    return filteredList;
  }

  public static void main(String[] args) {
    try (Scanner inputList = new Scanner(System.in)) {
      System.out.println("Enter the size of the array: ");
      int size = inputList.nextInt();
      int[] arr = new int[size];
      for (int i = 0; i < size; i++) {
        System.out.print("Enter the number at index " + (i) + " : ");
        arr[i] = inputList.nextInt();
      }
      List<Integer> output = uniqueElements(arr);
      System.out.println("Output => " + output);
    }
  }
}