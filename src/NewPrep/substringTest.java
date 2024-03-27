package NewPrep;

public class substringTest {


    public static void main(String arg[]){

          String s = "ababcd";

          int max = 0;

          for(int i=0;i<s.length();i++){

              StringBuilder builder = new StringBuilder();
              for(int j=i;j<s.length();j++){

                  if(builder.indexOf(String.valueOf(s.charAt(j)))!=-1){
                     break;
                  }
                  builder.append(s.charAt(j));
                  if(builder.length() > max){
                      max = builder.length();
                  }

              }


          }

         System.out.println(max);
    }

}
