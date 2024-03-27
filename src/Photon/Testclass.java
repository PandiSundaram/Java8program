package Photon;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testclass {



    public static void main(String main[]){
        String test = "Please sort the string based on word count";

        String [] stringArry = test.split("\\s");


       List<String> s =  Arrays.stream(stringArry).sorted((e1, e2) -> e1.length()>e2.length()?1:e1.length()<e2.length()?-1:0).collect(Collectors.toList());

       System.out.println(s);


    }

}
