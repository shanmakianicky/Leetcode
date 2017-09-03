package Leetcode;

public class Max_Consecutive_Ones {
    // 需要注意测试边界值，如{1}
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,0,1,1,1,0};
        System.out.println(count(array));
    }
    public static int count(int[] array){
        int count = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                count += 1;
            }
            else{
                if (temp < count){
                    temp = count;
                }
                count = 0;
            }
            // 边界值
            if (i == array.length - 1){
                return Integer.max(count,temp);
            }
        }
        return temp;

    }}
