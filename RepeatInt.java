import java.io.*;
import java.util.*;
  public class RepeatInt{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The array Size:");
      int Size=sc.nextInt();
      int A[]=new int[Size];
      int i,j,Ans=0;
        for(i=0;i<Size;i++)
          {
            A[i]=sc.nextInt();
          }
        if(A.length==Size)
          {
            for(i=0;i<Size;i++)
              {
                for(j=i+1;j<Size;j++)
                  {
                    if(A[i]==A[j])
                      {
                        Ans=0;
                      }
					else
					  {
						Ans=A[i];
					  }	
                  }
              }
             System.out.println("Answer:"+Ans);
          }
        else
          {
          System.out.println("Size varied");
          }
   }
 }  
              
            
       
