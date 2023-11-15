package generalquestions;

import javax.swing.*;

public class Anagram {

    public static void main(String[] args) {

        String ss="ahmadtttttttttttttttttttttttt";
        String vv="ahamdiiiiii";

        System.out.println(  isAnagram(vv,ss));

       int gg= JOptionPane.showConfirmDialog(null,"this is anagram method");

        System.out.println(gg);
    }

    public static boolean isAnagram(String a, String b){

        String max,min;
       if(a.length()>b.length()) {
           max = a;
           min=b;
       }else{
           max=b;
           min=a;
       }

           for (int i = 0; i < min.length(); i++) {


               if (!max.contains(min.charAt(i) + "")) {//if max not contains any letter from min that is getting looped
                   return false;
               }

           }
           return true;


    }
}
