package Leetcode.ContainerWithMostWater;

public class attempt1 {
    public static void main(String[] args) {
        int[] a = {1,2,4,3};
        System.out.println(maxArea(a));
    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        int leftIndex = 0;
        int rightIndex = height.length -1;
        while(i < j){
            if (max < (j-i)*Math.min(height[i],height[j])){
                max = (j-i)*Math.min(height[i],height[j]);
                leftIndex = i;
                rightIndex = j;
            }
            if (height[i] > height[j]){
                j--;
                continue;
            }else{
                i++;
                continue;
            }
        }
        return Math.min(height[leftIndex],height[rightIndex])*(rightIndex - leftIndex);

    }
}
