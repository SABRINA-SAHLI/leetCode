package org.twopointers;

public class Problem11_Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int ans = -1;
        int left = 0;
        int right = height.length-1;
        while(left< right){
            int temp =  Math.min(height[left], height[right]) * ( right - left);
            if(ans < temp) ans = temp;
            if(height[left] < height[right]){
                left++;
            }else {
                right --;
            }
        }
        return ans;
    }

    public static void main(String[]args){

        int[] height={1,8,6,2,5,4,8,3,7};
        int ans = maxArea(height);
        System.out.println("Max quantity is: "+ans);
    }



}
