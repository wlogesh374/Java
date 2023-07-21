class HeartPattern
{  
    // main() method start  
    public static void main(String[] args)  
    {  




        final int size = 8;  
        final String msg = "   I love Rathinam ";  
          


 for(int i=1; i<=7; i++)
     {

         int c=2;
         for(int k=1; k<=7-i-c; k++)
         {
             System.out.print(" ");
         } 



         for(int j=1; j<=i+c; j++)
         {
             System.out.print("*");

         } 



         for(int k=1; k<=2*(7-i+1)-1; k++)
         {
             System.out.print(" ");
         } 


         for(int j=1; j<=c+i; j++)
         {
             System.out.print("*");
         } 
         System.out.println();
c+=2;
     }         

               

}}  