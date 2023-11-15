package generalquestions;

import java.util.Arrays;
import java.util.Scanner;

public class AssigningGrades {

    public static void main(String[] args) {

        System.out.println("please enter the numbers of the students");
        Scanner scanner =new Scanner(System.in);
        int length=scanner.nextInt();

        System.out.println("enter the grades ");

        int [] grades =new int[length];

        for(int i =0;i<grades.length;i++){

            grades[i]=scanner.nextInt();
        }

        int max=max(grades);
        for (int i =0;i<grades.length;i++){
            if (grades[i]>=max-10){
                System.out.println("grade A "+i);
          } else if  (grades[i]>=max-20){
                System.out.println("grade B "+i);

          }else if  (grades[i]>=max-30) {
                System.out.println("grade C " + i);

            } else if  (grades[i]>=max-40) {
                System.out.println("grade D " + i);
            }else {
                System.out.println("Nakam motlaq"+1);
            }
            }

    }

    public static int max(int []grde){

        int holder =grde[0];
        for(int i =0;i<grde.length;i++){
            if(grde[i]>holder){
                holder=grde[i];
            }


        }
        return holder;
    }

}
