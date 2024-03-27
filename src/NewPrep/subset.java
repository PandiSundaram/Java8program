package NewPrep;

import java.util.HashSet;

public class subset {


   public static Boolean findSubset(int []a,int []b) {


       HashSet hashSet = new HashSet();

       for (int i = 0; i < a.length ; i++) {
           if (!hashSet.contains(a[i])) {
               hashSet.add(a[i]);
           }

       }

       for (int j = 0; j < b.length; j++) {
           if (!hashSet.contains(b[j])) {
               return false;
           }
       }

       return true;
   }

    public static void main(String arg[]){
           int arr1[] = {11, 1, 13, 21, 3, 7};
           int arr2[] = {11, 3, 7};

           System.out.println(findSubset(arr1,arr2));
    }

}
