//{ Driver Code Starts
import java.io.*;
import java.util.*;

// Driver class

// } Driver Code Ends
// User function Template for Java

class Solution {
    public long maxSum(Long[] arr) {
        // code here
        TreeMap<Long, Integer> a = new TreeMap<>();
        if(arr.length >2){
            for(Long obj : arr){
                if(!a.containsKey(obj)){
                    a.put(obj,1);
                }
                else{
                    a.put(obj,a.get(obj)+1);
                }
            }
            int n = arr.length;
            for(int i=0; i<n;i++){
                if(i%2 == 0){
                    arr[i] = a.firstKey();
                    if(a.get(a.firstKey())==1){
                        a.remove(a.firstKey());
                    }
                    else{
                        a.put(a.firstKey(),a.get(a.firstKey())-1);
                    }
                }
                else{
                    arr[i] = a.lastKey();
                    if(a.get(a.lastKey())==1){
                        a.remove(a.lastKey());
                    }
                    else{
                        a.put(a.lastKey(),a.get(a.lastKey())-1);
                    }
                }
            }
        }
        long sum =0;
        for(int i =0;i<arr.length;i++){
            if(i<arr.length-1){
                sum += Math.abs(arr[i]-arr[i+1]);
            }
            else{
                sum += Math.abs(arr[i]-arr[0]);
            }
        }
        return sum;
    }
}

//{ Driver Code Starts.
class Main {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the Long integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into Long integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            // Convert ArrayList to array
            Long[] arr = new Long[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call maxSum method and print result
            long ans = ob.maxSum(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
