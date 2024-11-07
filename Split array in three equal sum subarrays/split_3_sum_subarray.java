//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine().trim());

        while (testCases-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            Solution ob = new Solution();
            List<Integer> result = ob.findSplit(arr);

            if (result.get(0) == -1 && result.get(1) == -1 || result.size() != 2) {
                System.out.println("false");
            } else {
                int sum1 = 0, sum2 = 0, sum3 = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i <= result.get(0))
                        sum1 += arr[i];

                    else if (i <= result.get(1))
                        sum2 += arr[i];

                    else
                        sum3 += arr[i];
                }
                if (sum1 == sum2 && sum2 == sum3) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to determine if array arr can be split into three equal sum sets.
    public List<Integer> findSplit(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // If total sum is not divisible by 3, return {-1, -1}
        if (totalSum % 3 != 0) {
            return List.of(-1, -1);
        }

        int targetSum = totalSum / 3;
        int currentSum = 0;
        int firstSplitIndex = -1;
        int secondSplitIndex = -1;

        // Find the first split index
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == targetSum && firstSplitIndex == -1) {
                firstSplitIndex = i; // Found the first split
            } else if (currentSum == 2 * targetSum && firstSplitIndex != -1) {
                secondSplitIndex = i; // Found the second split
                break; // We can stop here as we found both indices
            }
        }

        // If we found both indices, return them
        if (firstSplitIndex != -1 && secondSplitIndex != -1) {
            return List.of(firstSplitIndex, secondSplitIndex);
        }

        return List.of(-1, -1); // If not found, return {-1, -1}
    }
}
