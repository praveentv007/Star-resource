import java.util.*;

public class trucktour {

    public static void main(String[] args) {
        
            Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
             int petrolpump[]=new int[n];
          int distance[]=new int[n];
      
        for(int i=0;i<n;i++){
            petrolpump[i]=in.nextInt();
             distance[i]=in.nextInt();
        }
          int start=0,end=1;
            int currpetrol=petrolpump[0]-distance[0];
         while(end!=start || currpetrol<0){
             while(start!=end && currpetrol<0){
                 currpetrol-=petrolpump[start]-distance[start];
                   start=(start+1)%n;
             }
                 currpetrol+=petrolpump[end]-distance[end];
                   end=(end+1)%n;
         }
        
         System.out.print(start);
    }
}
