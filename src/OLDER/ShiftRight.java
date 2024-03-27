package OLDER;

import java.util.concurrent.SynchronousQueue;

public class ShiftRight {


    public static int[] reverse(int[] ar,int start,int end){

        int temp=0;
        while(start < end){

            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }

        return ar;
    }


    public static void main(String arg[]) {
        int d = 2;
        int[] ar = {1,2,3,4,5,6,7};
        int start = 0;
        int end = ar.length-1;
        

        reverse(ar,start,end-d);
        reverse(ar,end-d+1,end);
        reverse(ar,start,end);

//        reverse(ar,start,d-1);
//        reverse(ar,d,end);
//        reverse(ar,start,end);



        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

    }


}
