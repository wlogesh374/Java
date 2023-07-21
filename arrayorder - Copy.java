import java.util.*;

class order
{
public static void main(String args[])
{

int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}

int max=a[0];
int min=a[0];
for(i=0;i<5;i++)
{
if(a[i]>max)
{
max=a[i];
}

if(a[i]<min)
{
min=a[i];
}


}

System.out.println("The max is  "+max);
System.out.println("The min is  "+min);



}
}


class avg
{
public static void main(String args[])
{

int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");
int s=0;

for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

s+=a[i];
}

float avg=s/n;

System.out.println("Array average "+avg);




}
}




class sort
{
public static void main(String args[])
{

int temp, n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");
int s=0;

for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}


for(i=0;i<n;i++)
{
  for(j=0;j<n;j++)
{
  if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;

}
}
}

System.out.println("Array ordered");


for(i=0;i<n;i++)
{
  
  System.out.print(a[i]+" ");
 
}

  System.out.println(" ");


System.out.println("The Second Smallest Element is "+a[1]);

System.out.println("The Second Largest Element is "+a[n-2]);







}
}






