package NewPrep;

import java.util.HashSet;

public class DivideConquer {

    public static int newone(int min,int maxlength, int[] a,int target){
        while(min <= maxlength){
            int middleNumber = (min+maxlength)/2;
            if(a[middleNumber] == target){
                return middleNumber;
            }else if(a[middleNumber] > target){
                min = middleNumber-1;
            }else if(a[middleNumber] < target){
                maxlength = middleNumber+1;
            }
        }
       return -1;
    }

    public static void main(String arg[]){

        int a[] = {1,2,3,4,9};

        int min = 0;
        int maxlength = a.length-1;

        int target = 2;

        System.out.println(newone(min,maxlength,a,target));





    }

}
