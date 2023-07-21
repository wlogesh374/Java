import java.util.*;
import java.io.*;
class jackarray
{
public static void main(String args[])
{

int arr[][]={{1,2,3},{4,5},{6,7,8,9}};
for(int i=0;i<=2;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}


}
}





class jacarray
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of rows");
System.out.print("no of col");

Scanner s=new Scanner(System.in);
n=s.nextInt();
m=s.nextInt();

int a[][]=new int[n][m];

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("the elements are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}



for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

count+=a[i][j];
}

}

System.out.println("The sum is "+count);


}}













class jaarray
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of rows of arr1");

Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.print("no of col array 1");
m=s.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];


System.out.println("enter the elements of array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("enter the elements of array 2are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("the elements array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}


System.out.println("the elements array2  are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}




for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

c[i][j]=a[i][j]+b[i][j];
}

}





System.out.println("the elements of sum of 2 arrays  are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(c[i][j]+" ");

}
System.out.println(" ");

}








}}






















