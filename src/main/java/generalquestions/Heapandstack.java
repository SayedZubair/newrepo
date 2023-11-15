package generalquestions;

public class Heapandstack {

    public static void main(String[] args) {



        //using new keyword we are creating new object if we use the same variabe garbage collector is deleting the preious one
        heap hp=new heap("ahmad");
        hp.name="jgj";

        hp.name="asad";
        hp=new heap("jgjgg");

        heap ss=hp;
        ss.name="mahmodd";


        int num1=21;
        int num2=num1;

        num2=34;


        print1();
        //System.out.println(isodd(100000));
    }

//stack examples

    public static void print1(){
       print2();
        System.out.println("1--> I am inside stack memory");
    }

    public static void print2(){
    print3();
        System.out.println("2--> I am inside stack memory");
    }
    public static void print3(){

        System.out.println("3--> I am inside stack memory");
    }


    public static boolean isodd(int num){
        if(num==2){
            return false;
        }else if(num==1){
            return true;
        }

        return isodd(num-2);
    }

}
class heap{


    String name;

    public heap(String name){

        this.name=name;
    }


}