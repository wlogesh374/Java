import java.util.*;

class size
{
public static void main(String args[])
{
int n,i;

Scanner sc=new Scanner(System.in);
System.out.println("Array size");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}
System.out.println("Array");

for(i=0;i<n;i++)
{
   

System.out.print(a[i]+" ");

}
}
}


class main{

public static void main(String args[])
{


int[][] intArray = {{2,5,46}, {12,34,20}}; 

 System.out.println(Arrays.deepToString (intArray));


}}








class Main {

public static void main(String[] args) {

int [] a = {1, 2, 3, 4, 5, 6};
 int [] b= a; 


for (int i: b) {

System.out.print( i+ ", ");


}

}

}

