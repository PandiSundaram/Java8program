package OLDER;

public class ShiftLeft {


    public static void main(String arg[]) {

        int d = 2;

        int[] ar = {1, 2, 4, 5, 6};
        int l = ar.length;

        int temp[] = new int[2];

        for(int i=0;i<d;i++){
            temp[i]=ar[i];
        }

        for(int i=d;i<l;i++){
            ar[i-d] = ar[i];
        }

        int r =0;
        for(int i=l- temp.length;i<l;i++){
            ar[i] = temp[r];
            r++;
        }


        for(int j=0;j<ar.length;j++){
            System.out.println(ar[j]);
        }

    }

}
