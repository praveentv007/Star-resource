import java.util.*;

public class ugly{

 public static void main(String args[]){

    Scanner in=new Scanner(System.in);

      int n=in.nextInt();

     int[] ugly=new int[n];
  int i2=0,i3=0,i5=0;
         ugly[0]=1;
          int nextugly=1;
       int next2=ugly[i2]*2,next3=ugly[i3]*3,next5=ugly[i5]*5;
         
     for(int i=1;i<n;i++){
          
               nextugly=Math.min(next2,Math.min(next3,next5));
           ugly[i]=nextugly;
        if(nextugly==next2){
                  i2++;
                next2=ugly[i2]*2;
         }
      if(nextugly==next3){
                  i3++;
                next3=ugly[i3]*3;
         }
      if(nextugly==next5){
                  i5++;
                next5=ugly[i5]*5;
         }
         
      



         

        }


        System.out.print(nextugly);




}}
