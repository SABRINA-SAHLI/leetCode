package org.slidingWindow;

//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubbaray {


  public  static  long maximumSumSubarray(int k, int[] arr , int n){
        Long ans = 0L;
        int i=0;
        int j=0;

        if(n < k){
            System.out.println(" invalid");
        }
        while(i < k){
         ans += arr[i];
         i++;
      }
      Long temp = ans.longValue();
      while(i < n){
            temp += arr[i];
            temp -= arr[i-k];
            ans = Math.max(temp, ans);
            i++;

      }
        return ans;
    }



    public static void main(String[] args){

        int[] nums={100, 200, 300, 400};
        long ans =  maximumSumSubarray(2,nums,4);
        System.out.println(" ans "+ ans);
    }
}
