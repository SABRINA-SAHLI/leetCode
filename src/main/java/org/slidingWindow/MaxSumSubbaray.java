package org.slidingWindow;

//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubbaray {


  public  static  int maximumSumSubarray(int k, int[] arr , int n){
      int ans = 0;
      int i=0;
      if(n < k){
          System.out.println(" invalid");
      }
      while(i < k){
          ans += arr[i];
          i++;
      }
      int temp = ans;
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
       int ans =  maximumSumSubarray(2,nums,4);
       System.out.println(" ans "+ ans);
    }
}
