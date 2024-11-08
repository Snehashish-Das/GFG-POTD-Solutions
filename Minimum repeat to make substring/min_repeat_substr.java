//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A, B));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minRepeats(String s1, String s2) {
        // code here
        for(int i = 0; i<s2.length(); i++){
            if(!s1.contains(String.valueOf(s2.charAt(i)))){
                return -1;
            }
            
        }
        
        int count = 0;
        int stop = (s2.length()/s1.length())+1;
        StringBuilder str = new StringBuilder();
        while(count<=stop){
            str.append(s1);
            count++;
            if(str.toString().contains(s2)){
                return count;
            }
        }
        return -1;
    }
};
