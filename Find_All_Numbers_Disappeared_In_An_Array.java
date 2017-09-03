package Leetcode;
import java.util.ArrayList;
import java.util.List;
//RTE
public class Find_All_Numbers_Disappeared_In_An_Array {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(find(array));
    }

    public static List<Integer> find(int[] array){
        List<Integer> arrayToList = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            arrayToList.add(array[i]);
        }

        return arrayToList;
    }

}
