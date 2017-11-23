package Leetcode.TwoSum;

public class sum {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,8};
        System.out.println(twoSum(8,a));
    }
    public static int[] twoSum(int target, int[] array){
        int j = array.length - 1;
        int[] result = new int[2];
        for(int i = 0; i < array.length - 1 && j>0; i++){
            if (array[i] + array[j] == target){
                result[0] = array[i];
                result[1] = array[j];
                return result;
            }else if (array[i] + array[j] < target){
                continue;
            }else{
                j--;
            }
        }
        return null;
    }
}
