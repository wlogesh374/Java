import java.util.*;

class arreql
{
public static void main(String args[])
{

int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Array size A");

n=sc.nextInt();

int a[]=new int[n];

System.out.println("Array elements A");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt();  

}

int n2;
System.out.println("Array size B");

n2=sc.nextInt();

int b[]=new int[n];

System.out.println("Array elements B");
for(i=0;i<n2;i++)
{

b[i]=sc.nextInt();  

}

System.out.println("is the arrays are equal; "+Arrays.equals(a,b));


}



}

class Intersection
{
public static void main(String args[ ])
{  
int[] arr1=new int[]{1,2,3,4};
int[] arr2=new int[]{1,2,9,7};

   for(int i=0; i<arr1.length; i++ )
 {
       for(int j=0; j<arr2.length; j++) 
{
           
           if(arr1[i]==arr2[j])
 {
              System.out.println(arr2[j]);
            }
        }
    }

}

}




