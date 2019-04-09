package day01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class IsPalindrome {
    public static void main (String[] args){
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x){
        if (x< 0){
            return false;
        }
        char [] chars = String.valueOf(x).toCharArray();
        if (x/10<10){
            ArrayList<Character> arr = new ArrayList<Character>();
            for (int i=0;i<chars.length;i++){
                  arr.add(chars[i]);
            }
            if (arr.size()>1){
                if(arr.get(0).equals(arr.get(1)) ){
                    return true;
                }
                return false;
            }
            return true;
        }
        if(chars.length % 2 == 0 && x/10>=10){
            char[] arr = Arrays.copyOf(chars, chars.length / 2);
            char[] arr1 = Arrays.copyOfRange(chars, chars.length / 2 , chars.length);
            StringBuilder sb = new StringBuilder(String.valueOf(arr1));
            StringBuilder sb1 = new StringBuilder(String.valueOf(arr));
            if (sb1.toString().equals(sb.reverse().toString())) {
                return true;
            }
        }else if (chars.length % 2 != 0 && x/10>=10){
            for (int i=0;i<chars.length;i++) {
                char[] arr = Arrays.copyOf(chars, chars.length / 2);
                //包括开头不包括结尾
                char[] arr1 = Arrays.copyOfRange(chars, chars.length / 2 + 1, chars.length);
                StringBuilder sb = new StringBuilder(String.valueOf(arr1));
                StringBuilder sb1 = new StringBuilder(String.valueOf(arr));
                if (sb1.toString().equals(sb.reverse().toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}
