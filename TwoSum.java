import java.util.Arrays;

public class TwoSum { /** Brute force recommendation **/
    public int [] TwoSum (int[] num, int sum) { /** Method initializer, two parameters: int array num and int sum**/
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length; j++) { /** Nested for loop, runs through i, then runs through j, finding two numbers**/
                if ((num[i] + num[j] == sum)) { /** If the answer to "sum" is here, the if statement will move to a return statement **/
                    if (num[i] == num[j]) {
                        break;
                    } else {
                        return new int[]{i, j}; /** Return the array of the correct two indexes of the numbers that add to the sum**/
                    }
                }
            }
        }
        return new int[] {-1}; /** Returns -1 if no solution**/
    }

    public static void main (String[] args) {
        int[] num = {2, 12, 8, 7}; /** Initializes the array with several integers to test for the correct sum**/
        int sum = 9;
        TwoSum twosum = new TwoSum();
        System.out.println(Arrays.toString(twosum.TwoSum(num, sum))); /** Prints the num array with the correct added numbers **/
    }
}
