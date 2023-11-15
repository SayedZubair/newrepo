import java.util.Arrays;

public class myPractice {

    //fabinncci

    public static int []fabbinnaci (int num){


        int arr[]=new int[num];
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<arr.length;i++){

            arr[i]=arr[i-1]+arr[i-2];

        }
        return arr;
    }



    public static boolean isprime(int n){
        for (int i =2;i<n/2;i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(fabbinnaci(12)));
    }
}
