package Leetcode.LongestPalindromicSubstring;

public class attempt1 {
    public static void main(String[] args) {
        System.out.println(substring("aabaabd"));
    }
    public static String substring(String s){
        int maxRight = 0;
        int pos = 0;
        String maxString;
        String string;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            sb.append("#");
            sb.append(Character.toString(s.charAt(i)));
        }
        sb.append("#");
        string = sb.toString();
        int[] RL = new int[string.length()];
        for (int i = 0; i < string.length(); i++){
            if (i == 0){
                RL[i] = 1;
                continue;
            }
            if (i < maxRight){
                int j = 2*pos - i;
                if (RL[j]< maxRight - i){
                    RL[i] = RL[j];
                }else{
                    RL[i] = maxRight - i;
                }
            }else{
                RL[i] = 1;
            }
            while (i - RL[i] >= 0 && i +RL[i] < string.length() && string.charAt(i - RL[i])== string.charAt(i + RL[i])){
                RL[i]++;
            }

            if (i + RL[i] > maxRight){
                maxRight = i + RL[i];
                pos = i;
            }
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < string.length(); i++){
            if (RL[i]>max){
                max = RL[i];
                maxIndex = i;
            }
        }
        String r = string.substring(maxIndex - RL[maxIndex] + 1,maxIndex + RL[maxIndex] - 1);
        String[] a = r.substring(1,r.length()).split("#");
        String result = "";
        for (int i = 0; i < a.length; i++){
            result += a[i];
        }
        return result;


    }




}
