package generalquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreAVe {

    public static void main(String[] args) {
        List<Integer>scores=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the scores ");
       int num= scanner.nextInt();
        while (num>=0){
            scores.add(num);

            num=scanner.nextInt();

        }

       int avg=average(scores);


        System.out.println(avg);


        int AboveAvg=0;
        int belowAvg=0;

        for(int n:scores){
            if (n>=avg){
                AboveAvg++;
            }else {
                belowAvg++;
            }
        }

        System.out.println(AboveAvg);
        System.out.println(belowAvg);
    }

    public static int average(List <Integer> num){
        int holder=0;
        for (int n:num) {
            holder+=n;
        }
        return holder/num.size();
    }

}
