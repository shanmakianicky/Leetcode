package Leetcode;

/**
 * Created by SJB on 5/7/17.
 */

/**
    XOR. 1110 ^ 1101 = 0011
 */
public class Hamming_Distance {
    public static void main(String[] args) {
        int x = 297630147;
        int y = 147274294;
        double result = hammingDistance(x,y);
        System.out.println(result);

    }
    //10001101111010111100111000011
    //1000110001110011101000110110
    public static double hammingDistance(int x, int y){
        int count = 0;
        String xString = Integer.toBinaryString(x);
        String yString = Integer.toBinaryString(y);
        int lengthX = xString.length();
        int lengthY = yString.length();
        if (lengthX > lengthY){
            for (int i = 0; i<lengthX-lengthY;i++){
                yString = "0"+yString;
                System.out.print(xString);

            }
        }else if(lengthX < lengthY){
            for (int i = 0; i<lengthY - lengthX;i++){
                xString = "0"+xString;
        }}

        for (int i = 0; i<xString.length(); i++){
                if (xString.charAt(i) != yString.charAt(i)){
                    count++;
                }
            }

        return count;
    }
// Sample solution
    public int hammingDistanceSample(int x, int y) {
        int or = x ^ y;
        int result = 0;
        while(or > 0 ){
            if ((or & 1) == 1) {
                result++;
            }
            // >>= 向右移动一位的值赋给原变量
            or >>= 1;
        }
        return result;
    }
}
