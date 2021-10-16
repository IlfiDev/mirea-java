package com.ilfidev.Classes;

public class Functions {
    public static void Exercise10(int a){
        if(a <= 0){
            return;
        }
        System.out.print(a%10);

        Exercise10(a/10);

        return;
    }
    public static int Exercise9(int zero, int one){
        if(zero > one + 1) {
            return 0;
        }
        if(zero == 0 || one == 0){
            return 1;

        }
        return Exercise9(zero, one -1) + Exercise9(zero - 1, one - 1);
    }
    public static boolean Exercise8(int start, int end, String str){
        if (str.charAt(start) != str.charAt(end))
        {
            return false;
        }
        else if ((start == end) || (start < end)){
            return true;

        }
        else
        {
            return Exercise8(start + 1, end - 1, str);
        }

    }
}
