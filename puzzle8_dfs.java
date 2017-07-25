import java.util.*;

public class puzzle8_dfs{

public static String swap(char c[],int a,int b){
    char temp=c[a];
      c[a]=c[b];
     c[b]=temp;
  
      return new String(c);
}



public static void main(String args[]){

    Scanner in=new Scanner(System.in);
   
    String initial=in.next();
   String goal="123456780";
   HashSet<String> hs=new HashSet<String>();
    Stack<String> st=new Stack<String>(); 

        st.push(initial);
      hs.add(initial);
   
      while(!st.empty()){
     
           String s=st.pop();
        if(s.equals(goal)){
        System.out.println(s);
           System.out.println("YES");   
         break;
       }
             
     if(s.indexOf('0')==0){
      
                     
     String s1=swap(s.toCharArray(),0,1);
     String s2=swap(s.toCharArray(),0,3);
      System.out.println(s1);
         System.out.println(s2);
     System.out.println("");
           

           if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
        
 
      }
       else if(s.indexOf('0')==2){
      
                     
     String s1=swap(s.toCharArray(),2,1);
     String s2=swap(s.toCharArray(),2,5);
          System.out.println(s1);
         System.out.println(s2);
     System.out.println("");
            


          if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
        
 
      }
      else if(s.indexOf('0')==6){
      
                     
     String s1=swap(s.toCharArray(),6,3);
     String s2=swap(s.toCharArray(),6,7);
        
        System.out.println(s1);
         System.out.println(s2);
     System.out.println("");
      
 

         if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
        
 
      }
        else if(s.indexOf('0')==8){
      
                     
    


      String s1=swap(s.toCharArray(),8,5);
     String s2=swap(s.toCharArray(),8,7);
    System.out.println(s1);
         System.out.println(s2);
     System.out.println("");
      
 


       if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
        
 
      }
      else if(s.indexOf('0')==4){
      
                     
     String s1=swap(s.toCharArray(),4,1);
     String s2=swap(s.toCharArray(),4,3);
      String s3=swap(s.toCharArray(),4,5);
     String s4=swap(s.toCharArray(),4,7);
           
           System.out.println(s1);
         System.out.println(s2);
 System.out.println(s3);
         System.out.println(s4);
     System.out.println("");
      

     
      

   

         if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
           if(!hs.contains(s3)){
           hs.add(s3);
            st.push(s3);  
         }       
        if(!hs.contains(s4)){
           hs.add(s4);
            st.push(s4);  
         }       
                
 
      }
          else if(s.indexOf('0')==1){
      
                     
     String s1=swap(s.toCharArray(),1,0);
     String s2=swap(s.toCharArray(),1,2);
      String s3=swap(s.toCharArray(),1,4);

               System.out.println(s1);
         System.out.println(s2);
 System.out.println(s3);
         System.out.println("");
     

         if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
           if(!hs.contains(s3)){
           hs.add(s3);
            st.push(s3);  
         }       
                
 
      }
     else if(s.indexOf('0')==3){
      
                     
     String s1=swap(s.toCharArray(),3,0);
     String s2=swap(s.toCharArray(),3,6);
      String s3=swap(s.toCharArray(),3,4);

     System.out.println(s1);
         System.out.println(s2);
 System.out.println(s3);
         System.out.println("");
     

         if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
           if(!hs.contains(s3)){
           hs.add(s3);
            st.push(s3);  
         }       
                
 
      }
        else if(s.indexOf('0')==5){
      
                     
     String s1=swap(s.toCharArray(),5,2);
     String s2=swap(s.toCharArray(),5,8);
      String s3=swap(s.toCharArray(),5,4);

     System.out.println(s1);
         System.out.println(s2);
 System.out.println(s3);
         System.out.println("");
     

         if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
           if(!hs.contains(s3)){
           hs.add(s3);
            st.push(s3);  
         }       
                
 
      }
            else if(s.indexOf('0')==7){
      
                     
     String s1=swap(s.toCharArray(),7,4);
     String s2=swap(s.toCharArray(),7,6);
      String s3=swap(s.toCharArray(),7,8);

     System.out.println(s1);
         System.out.println(s2);
 System.out.println(s3);
         System.out.println("");
     

         if(!hs.contains(s1)){
           hs.add(s1);
            st.push(s1);  
         }       
         if(!hs.contains(s2)){
           hs.add(s2);
            st.push(s2);  
         }       
           if(!hs.contains(s3)){
           hs.add(s3);
            st.push(s3);  
         }       
                
 
      }
   
      
      











}
}
}
