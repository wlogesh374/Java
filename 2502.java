import java.util.*;

class alice
{
public static void main(String args[])
{
int n,i,count=0;

Scanner sc=new Scanner(System.in);
System.out.println("Array size");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}
System.out.println("Given Array");

for(i=0;i<n;i++)
{
   

System.out.print(a[i]+" ");

}

for(i=0;i<n-1;i++)
{
if(a[i]==a[i+1])
{

}
else
{

count++;
}


}



if(a[0]==a[n-1])
{

}
else
{

count++;
}

System.out.print("\nThe mistakes are "+count);


}
}





















class one
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
int b[]=new int[n];


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
b[i]=0;
}
}

System.out.println("the elements are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]);

}
System.out.println(" ");

}




for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(a[i][j]==1)
{
b[i]++;
}

}

}

int l=0,max=0;


for(i=0;i<n;i++)
{
if(b[i]>max)
{
max=b[i];
l=i+1;
}

}
System.out.println("the row "+l+" has max no of 1's");



}}








class elves
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Row and Column Size:");
	int n1=s.nextInt();
	int n2=s.nextInt();

	int total=n1*n2-4;

	int count=0; 

	int arr[][]={{3,0,3,7,3},{2,5,5,1,2},{6,5,3,3,2},{3,3,5,4,9},{3,5,3,9,0}};
	int max;

	for(int i=0;i<n1;i++)
{

	max=arr[i][0];

	for(int j=1;j<n2;j++)
{

	if(arr[i][j]>max)
{

	count++;

	max=arr[i][j];
}
}
}

System.out.printf("\nWith %d trees visible on the edge and another %d visible in the interior, a total of %d trees are visible in this arrangement",total-count+1,count-1,total);
}
}








