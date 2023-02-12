package one;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        String str="abcdd";
        int maxlength=0;
        int len=str.length();
        int i=0, j=0;
        Set<Character> set= new HashSet<Character>();
        while (i<len){
            if(!set.contains(str.charAt(i))){
             set.add(str.charAt(i));
                i++;
                maxlength= Math.max(maxlength,i-j);
              //  System.out.println(maxlength);
            }
            else{
set.remove(str.charAt(j));
                j++;
            }
        }
        System.out.println(set  );
        System.out.println("Output"+maxlength);
    }
}
