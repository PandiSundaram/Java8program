package NewPrep;

import java.util.HashSet;

public class Ranjepresent {

    public static void findone(int a[],int l,int start,int end) {
//
//        arr[] = {10, 12, 11, 15},
//        low = 10, high = 15

        for (int i = start; i <= end; i++) {
            Boolean found = false;

            for (int j = 0; j < a.length; j++) {

                if (i == a[j]) {
                    found = true;
                    break;
                }

            }

            if (found == false) {
                System.out.println(i);
            }


        }




    }

    public static void findonev1(int arr[],int len, int start,int end){

        HashSet hashSet = new HashSet<>();
        for(int i=0;i<len;i++){
            hashSet.add(arr[i]);
        }

        for(int j=start;j<=end;j++){

          if(!hashSet.contains(j)){
              System.out.println(j);
          }

        }

    }




    public static void main(String arg[]){

        int arr[] = {10, 12, 11, 15};
//        low = 10, high = 15

        findonev1(arr,arr.length,10,15);
    }


}
