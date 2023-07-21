
 class HeartPatternExample1  
{  
        public static void main(String[] args)  
        {  

       
         final int size = 9 ;  
int j,i;
                  int c=0;  

            
           for(i=1;i<=6;i++)
{
 


 
  
for(j=1;j<=7-i;j++)
{

System.out.print(" ");

}

for(j=1;j<=7+c;j++)
{

System.out.print("*");

}


for(j=1;j<=14-2*i;j++)
{

System.out.print(" ");

}

for(j=1;j<=7+c;j++)
{

System.out.print("*");

}

c+=2;
System.out.println(" ");
}

       




               
           for (int m = 1; m <= 2 * size; m++)  
                {  
                    for (int n = 0; n < m; n++) {  
                        System.out.print(' ');  
                }  
                for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                        System.out.print("*");  
                    }  
                System.out.print(System.lineSeparator());  
            }  
    }  
}  