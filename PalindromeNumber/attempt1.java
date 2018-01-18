package Leetcode.PalindromeNumber;

public class attempt1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }
    public static boolean isPalindrome(int n){
        if (n < 0){
            return false;
        }
        int help = 1;
        while (n/10 >= help){
            help *= 10;
        }
        while (n > 1){
            int high = n / help;
            int low = n % 10;
            if (low != high){
                return false;
            }
            n = (n % help)/10;
            help /= 100;
        }
        return true;

    }
}
