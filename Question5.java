import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    int maxValue = 0, maxCount = 0;

    int loopNumber = in.nextInt();
    int[] numberList = new int[loopNumber];

    for (int iterateNumber = 0; iterateNumber < loopNumber; iterateNumber++) {
      int inputNumber = in.nextInt();
      numberList[iterateNumber] = inputNumber;
    }

    for (int occurance = 0; occurance < numberList.length; occurance++) {
      int count = 0;
      for (int repeated = 0; repeated < numberList.length; repeated++) {
        if (numberList[repeated] == numberList[occurance]) {
          ++count;
        }

        if (count > maxCount) {
          maxCount = count;
          maxValue = numberList[occurance];
        }
      }
    }
    System.out.print(maxValue);
  }
}