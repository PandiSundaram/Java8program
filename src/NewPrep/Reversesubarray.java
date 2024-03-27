package NewPrep;

public class Reversesubarray {


    public static int[] revers(int start,int end,int []a){
        int temp = 0;
        while(start <end){
            temp = a[start];
            a[end] = a[start];
            a[start] = temp;
            start ++;
            end --;
        }

        return a;
    }

    public static Boolean reversesub(int a[],int length){


//        Input : arr [] = {1, 2, 5, 4, 3}
//        Output : Yes


        int start= -1;
        int end = -1;

        for(int i=0;i<a.length-1;i++){

            if(a[i]>a[i+1]){

                if(start==-1){
                    start = i;
                }
                end = i+1;
            }

        }


        int b[] =  revers(start,end,a);

        for(int i=0;i<b.length-1;i++){
            if(b[i] > b[i+1]){
                return false;
            }
        }

        return true;

    }





    public static void main(String arg[]){

    }

}
