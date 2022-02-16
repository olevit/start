package com.company;

public class isogram {
    public static boolean  isIsogram(String str) {
        if(str.length() < 2){
            return true;
        }
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                char si = str.charAt(i);
                char sj = str.charAt(j);
                if(si == sj || si == sj + 'a' - 'A'){
                    return false;
                }
            }
        }
        return true;
    }

}
