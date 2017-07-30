import java.util.*;
public class insertionsort{
public static void main(String args[]){
   Scanner scan=new Scanner(System.in);
     System.out.println("Enter the no.of elements");
        int n=scan.nextInt();
      int arr[]=new int[n];
      
     for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
     }
   
        for(int i=1;i<n;i++){
           int key=arr[i],j=i-1;
               for(;j>=0 && key<arr[j];j--){
                   arr[j+1]=arr[j];
                    

                    }
 
                       arr[j+1]=key;
              for(int k=0;k<n;k++){
                  System.out.print(arr[k]+"\t");
                 }
                   System.out.println();
                            

         }


}

}
