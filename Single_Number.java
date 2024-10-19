class Solution {
    int getSingle(int arr[]) {
        // code here
        int ans =0;
        for(int i=0;i<arr.length;i++)
        {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
