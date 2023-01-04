package com.t3h.btstring;

public class Ex1 {
    public int sumNumberOfStr(String str){
        for ( int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if ( c < '0' || c > '9'){
                str = str.replace(c, ' ');
            }
        }

        int sum = 0;
        String ss[] = str.split(" ");
        for ( int i = 0; i < ss.length; i++){
            if (!ss[i].equals("")){
                sum+= Integer.parseInt(ss[i]);
            }
        }

        return sum;
    }
}
