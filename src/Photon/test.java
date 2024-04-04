package Photon;

public class test {

    public static void main(String arg[]){


        int a[] ={1,9,11,6,2};
        int temp;



        for(int i=0;i<a.length;i++){


            for(int j=i;j<a.length;j++){

                if(a[i]>a[j]){

                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }

            }


        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }



}
