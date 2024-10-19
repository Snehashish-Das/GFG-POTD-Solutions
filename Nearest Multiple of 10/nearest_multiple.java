//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    String roundToNearest(String str) {
        // Complete the function
        int n=str.length();
        if(str.charAt(n-1)<='5'){
            str=str.substring(0,n-1)+"0";
            return str;
        }
        //str=str.substring(0,n-1)+"0";
        int i=n-2;
        while(i>=0 && str.charAt(i)=='9'){
            i--;
        }
        String s="";
        if(i<0){
            s="1";
            for(int j=0;j<n;j++){
                s+="0";
            }
            return s;
            //9997----10000
            
        }
            char ch= str.charAt(i);
            ch=(char)(ch+1);
            s= str.substring(0,i)+ch;
            for(int j=s.length();j<n;j++){
                s+="0";
            }
            return s;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends
