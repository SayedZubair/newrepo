package generalquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {

   private int arr[];
   private int index;

    public MyArrayList(){

        arr=new int[10];

        index=-1;
    }


    public int get(int indexNum){

       return arr[indexNum];

    }

    public void add  (int num){
        index++;
        if(index==arr.length){

            int secarr[]=new int [index*2];

            for (int i =0;i<arr.length;i++){

                secarr[i]=arr[i];
            }

            arr=secarr;

        }
        arr[index]=num;

    }

    public int size(){

        return index+1;
    }

    public void print(){


     //   System.out.println(Arrays.toString(arr));

        for (int i =0;i<=index;i++){
            System.out.print(get(i)+" ");
        }

    }



    public void remove (int index){

       for(int i=index;i<size();i++){
           arr[i]=arr[i+1];

       }
       this.index--;
    }



}
class test{


    public static void main(String[] args) {

        MyArrayList list=new MyArrayList();
        list.add(33);
        list.add(34);
        list.add(336);
        list.add(3327);
        list.add(332);
        list.add(332);


        list.print();

        list.remove(2);
        System.out.println();
        list.print();
      List<Integer>num=new ArrayList<>();
//
     num.add(44);
     num.add(44);

        System.out.println(num.size());

int []myarr=new int[10];

myarr[0]=33;


        System.out.println(myarr.length);


    }
}