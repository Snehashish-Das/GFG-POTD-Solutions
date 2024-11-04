//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

//-------------------------------MAIN CODE--------------------------
// } Driver Code Ends
// User function Template for Java
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
     List<List<Integer>> ar=new ArrayList<List<Integer>>();
      for(int i=0;i<arr.length;++i)
      {for(int j=i+1;j<arr.length;++j)
       {  
        for(int k=j+1;k<arr.length;++k)
         {
           int sum=arr[i]+arr[j]+arr[k];
           if(sum==0)
            { List<Integer> a1=new ArrayList<>();
              a1.add(i);
              a1.add(j);
              a1.add(k);
              ar.add(a1);
              
              k++;
             
             
            }
             
         }
      }
      }
        return ar;    
        }
    
        
}
//---------------------------------------------------------------------------
//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            List<List<Integer>> res = obj.findTriplets(nums);
            Collections.sort(res, (a, b) -> {
                for (int i = 0; i < a.size(); i++) {
                    if (!a.get(i).equals(b.get(i))) {
                        return a.get(i) - b.get(i);
                    }
                }
                return 0;
            });
            if (res.size() == 0) {
                System.out.println("[]");
            }
            for (int i = 0; i < res.size(); i++) {
                for (int j = 0; j < res.get(i).size(); j++) {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends
